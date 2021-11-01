package com.complaintservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.complaintservice.entity.Complaint;


/**
 * 
 * @author Ragini
 *
 */
@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
	
}
