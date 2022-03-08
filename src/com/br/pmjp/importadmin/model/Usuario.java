package com.br.pmjp.importadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private String firstName; // required
	private String lastName; // required
	private String emailAddress; // required
	private String password; // required
	private String passwordHashFunction; // upload only
	private String orgUnitPath; // required
	private String newPrimaryEmail; // upload only
	private String recoveryEmail;
	private String homeSecondaryEmail;
	private String workSecondaryEmail;
	private String recoveryPhone; // [MUST BE IN THE E.164 FORMAT]
	private String workPhone;
	private String homePhone;
	private String mobilePhone;
	private String workAddress;
	private String homeAddress;
	private String employeeID;
	private String employeeType;
	private String employeeTitle;
	private String managerEmail;
	private String department;
	private String costCenter;
	private String buildingID;
	private String floorName;
	private String floorSection;
	private String changePasswordatNextSignIn;
	private String newStatus; // upload only
	private String newLicenses; // upload only
	private String advancedProtectionProgramEnrollment;
	
	public Usuario(String firstName, String lastName, String emailAddress, String password, String passwordHashFunction, String orgUnitPath, String newPrimaryEmail, String newStatus, String newLicenses) {
		this.firstName = firstName; // required
		this.lastName = lastName; // required
		this.emailAddress = emailAddress; // required
		this.password = password; // required
		this.passwordHashFunction = passwordHashFunction; // upload only
		this.orgUnitPath = orgUnitPath; // required
		this.newPrimaryEmail = newPrimaryEmail; // upload only
		this.newStatus = newStatus; // upload only
		this.newLicenses = newLicenses; // upload only
	}
	
	public Usuario(String firstName, String lastName, String emailAddress, String password, String orgUnitPath) {
		this.firstName = firstName; // required
		this.lastName = lastName; // required
		this.emailAddress = emailAddress; // required
		this.password = password; // required
		this.orgUnitPath = orgUnitPath; // required
	}
}
