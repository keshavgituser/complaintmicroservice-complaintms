package com.complaintservice.service;

import java.util.List;

import com.complaintservice.entity.Complaint;
import com.complaintservice.exception.ComplaintNotFoundException;


/**
 * 
 * @author Ragini
 *
 */
public interface ComplaintService {
	
	public Complaint addComplaint(Complaint complaint);
	
	public Complaint getComplaintById(long complaintId) throws ComplaintNotFoundException;
	
	public boolean deleteComplaintById(long complaintId) throws ComplaintNotFoundException;
	
	public Complaint updateComplaint(Complaint complaint) throws ComplaintNotFoundException;
	
	public List<Complaint> getAllComplaint();

}
