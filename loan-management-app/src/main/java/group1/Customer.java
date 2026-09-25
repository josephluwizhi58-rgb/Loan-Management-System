package group1;

import java.math.BigDecimal;

public class Customer {
	String customerid;
	String firstname;
	String lastname;
	String nationalid;
	String emailaddress;
	String physicaladdress;
	String employmentstatus;
	String phonenumber;
	BigDecimal monthlyincome;
	String customerstatus;
	
	public Customer(String customerid, String firstname, String lastname, String nationalid, 
			String emailaddress, String physicaladdress, String employmentstatus, String phonenumber, BigDecimal monthlyincome, String customerstatus) {
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationalid = nationalid;
		this.emailaddress = emailaddress;
		this.physicaladdress = physicaladdress;
		this.employmentstatus = employmentstatus;
		this.phonenumber = phonenumber;
		this.monthlyincome = monthlyincome;
		this.customerstatus = customerstatus;
		}
		
		public String getCustomerId() {
			return customerid;
		}
		
		public String getFirstName() {
			return firstname;
		}
		
		public String getLastName() {
			return lastname;
		}
		
		public String getPhoneNumber() {
			return phonenumber;
		}
		
		public BigDecimal getMonthlyIncome() {
			return monthlyincome;
		}
		
		public String getEmailAddress() {
			return emailaddress;
		} 
		
		public String getNationalId() {
			return nationalid;
		}
		
		public String getPhysicalAddress() {
			return physicaladdress;
		}
		
		public String getCustomerStatus() {
			return customerstatus;
		}
		
		public String getEmploymentStatus() {
			return employmentstatus;
		}
		
		
		
		public void setMonthlyIncome(BigDecimal monthlyincome) {
			this.monthlyincome = monthlyincome;
		}
		
		}

		
