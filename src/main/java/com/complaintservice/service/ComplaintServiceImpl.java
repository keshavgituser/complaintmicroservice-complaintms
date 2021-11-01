package com.complaintservice.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaintservice.entity.Complaint;
import com.complaintservice.exception.ComplaintNotFoundException;
import com.complaintservice.repository.ComplaintRepository;

/**
 * 
 * @author Ragini
 *
 */
@Service
public class ComplaintServiceImpl implements ComplaintService{
	// Creating reference (it creates loosely coupled application)
		@Autowired
		private ComplaintRepository complaintRepository;
		
		private static final Logger logger = LoggerFactory.getLogger(ComplaintServiceImpl.class);

		/**
		 * Method for save or adding complaint with their details
		 */
	@Override
	public Complaint addComplaint(Complaint complaint) {
		logger.info(" Trying to add Complaint in service layer adding "+ complaint);
		if(complaint.getComplainDescription()==null) {
			throw new NullPointerException("Please enter all description");
		}
		return complaintRepository.save(complaint);
	}

	/**
	 * Method for getcomplaint by using complaintId here you can find complaint details using their id.
	 */

	@Override
	public Complaint getComplaintById(long complaintId) throws ComplaintNotFoundException {
		logger.info("Inside Complaint service getComplaintById  ");
		try {
			Optional<Complaint> complaint=complaintRepository.findById(complaintId);
			if(complaint.get()!=null) {
				return complaint.get();
			}
		}
		catch(NoSuchElementException e){
			throw new ComplaintNotFoundException("Complaint with "+ complaintId + " Not Found!!" );
		}
		return null;
	}
	/**
	 * Method for delete complaint by using complaintId
	 */

	@Override
	public boolean deleteComplaintById(long complaintId) throws ComplaintNotFoundException {
		logger.info(" Trying to delete Complaint in service layer ");
		Complaint complaint=getComplaintById(complaintId);
		complaintRepository.delete(complaint);
		return true;
	}
	/**
	 * Updating or modifying complaint details
	 */
	@Override
	public Complaint updateComplaint(Complaint complaint) throws ComplaintNotFoundException {
		logger.info("Inside complaint service Updating complaint ");
		return complaintRepository.save(complaint);
	}
	/**
	 * Viewing all the complaints
	 */
	@Override
	public List<Complaint> getAllComplaint() {
		logger.info("Inside complaint service View all complaints ");
		try {
			return complaintRepository.findAll();
		}
		catch(Exception e) {
			throw new ComplaintNotFoundException("No Complaints Found!!");
		}
	}

}
