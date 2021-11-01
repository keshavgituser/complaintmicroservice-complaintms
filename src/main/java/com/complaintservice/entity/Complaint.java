package com.complaintservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author Ragini
 *
 */
@Entity
@Table(name="complaint")
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long complaintId;
	/**
	 * Description given as a Complaint it cannot be blank
	 */
	@NotEmpty
	@Size(max=150,message="Please Enter a description")
	@Column(name="descriptions")
	private String complainDescription;
	
	/**
	 * 
	 * createdBy field will contain name of farmer retrieved through session
	 */
	@NotEmpty(message="Please Enter a username of user")
	@Size(min=5,max=10,message="Enter a username between 5 to 10 characters")
	@Column(name="creators")
	private String createdBy;
	
	/**
	 * created at date time
	 */
	@Column(name="createdAt")
	private String createdAt;
	
	
	
	public Complaint(Long complaintId,
			@NotEmpty @Size(max = 150, message = "Please Enter a description") String complainDescription,
			@NotEmpty(message = "Please Enter a username of user") @Size(min = 5, max = 10, message = "Enter a username between 5 to 10 characters") String createdBy,
			String createdAt) {
		super();
		this.complaintId = complaintId;
		this.complainDescription = complainDescription;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	

	/**
	 * Default constructor
	 */
	public Complaint() {
		super();
	}

	public Complaint(Long complaintId, String complainDescription, String createdBy) {
		super();
		this.complaintId = complaintId;
		this.complainDescription = complainDescription;
		this.createdBy = createdBy;
	}

	/**
	 * @return the complaintId
	 */
	public Long getComplaintId() {
		return complaintId;
	}

	/**
	 * @param complaintId the complaintId to set
	 */
	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}


	/**
	 * @return the complainDescription
	 */
	public String getComplainDescription() {
		return complainDescription;
	}


	/**
	 * @param complainDescription the complainDescription to set
	 */
	public void setComplainDescription(String complainDescription) {
		this.complainDescription = complainDescription;
	}


	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}


	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
