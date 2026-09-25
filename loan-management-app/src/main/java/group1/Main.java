
package group1;

import java.math.BigDecimal;

public class Main{
	public static void main(String[] args) {
		
		Customer cus1 = new Customer(
				"C001",
				"Johnny",
				"Alubi",
				"NID001",
				"john@gmail.com",
				"Mangochi",
				"Employed",
				"0999123456",
				new BigDecimal ("500000"),
				"Active"
				);
		
	    System.out.println("Customer ID: " + cus1.getCustomerId());
		System.out.println("Name " + cus1.getFirstName() + " " + cus1.getLastName());
		System.out.println("Phone: " + cus1.getPhoneNumber());
	    System.out.println("Monthly Income: MKW " + cus1.getMonthlyIncome());
	    System.out.println("Email Address: " + cus1.getEmailAddress());
	    System.out.println("Physical Address: " + cus1.getPhysicalAddress());
	    System.out.println("Customer Status: " + cus1.getCustomerStatus());
	    System.out.println("National ID: " + cus1.getNationalId() );
	    System.out.println("Employment Status: " + cus1.getEmploymentStatus());
	    
	  
		
		}	
	
		
			}
