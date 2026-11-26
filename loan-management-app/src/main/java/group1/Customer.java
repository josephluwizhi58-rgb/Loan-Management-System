package group1;
import java.io.*;
import java.util.Scanner;

public class Customer {
	Scanner scanner = new Scanner(System.in);
	
	private String customerId;
	private String firstName;
	private String lastName;
	private String nationalId;
	private String emailAddress;
	private String physicalAddress;
	private String employmentStatus;
	private String phoneNumber;
	private double monthlyIncome;
	private String customerStatus;
	
	public Customer(String customerId, String firstName, String lastName, String nationalId, 
			String emailAddress, String physicalAddress, String employmentStatus, String phoneNumber, double monthlyIncome, String customerStatus) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
		this.employmentStatus = employmentStatus;
		this.phoneNumber = phoneNumber;
		this.monthlyIncome = monthlyIncome;
		this.customerStatus = customerStatus;
		}

        public Customer(){}
		
		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId){
			this.customerId = customerId;
		}

		public double getMonthlyIncome() {
			return monthlyIncome;
		}

		public void setMonthlyIncome(double monthlyIncome){
			this.monthlyIncome = monthlyIncome;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber){
			this.phoneNumber = phoneNumber;
		}
		
		public String getEmailAddress() {
			return emailAddress;
		} 

		public void setEmailAddress(String emailAddress){
			this.emailAddress = emailAddress;
		}
		
		public String getNationalId() {
			return nationalId;
		}

		public void setNationalId(String nationalId){
			this.nationalId = nationalId;
		}
		
		public String getPhysicalAddress() {
			return physicalAddress;
		}

		public void setPhysicalAddress(String physicalAddress){
			this.physicalAddress = physicalAddress;
		}
		
		public String getCustomerStatus() {
			return customerStatus;
		}

		public void setCustomerStatus(String customerStatus){
			this.customerStatus = customerStatus;
		}
		
		public String getEmploymentStatus() {
			return employmentStatus;
		}

		public void setEmploymentStatus(String employmentStatus){
			this.employmentStatus = employmentStatus;
		}
		
	    public void addCustomer(){

			System.out.println("***********************************");
			System.out.println("==== ADD CUSTOMER DETAILS ====");
			System.out.println("***********************************");

			System.out.println("Enter Customer Id: ");
			this.customerId = scanner.nextLine();
			System.out.println("Enter First Name: ");
			this.firstName=scanner.nextLine();

			System.out.println("Enter Last Name: ");
			this.lastName=scanner.nextLine();

			System.out.println("Enter national ID: ");
			this.nationalId=scanner.nextLine();
			
			System.out.println("Enter Phone number: ");
			this.phoneNumber=scanner.nextLine();
			
			System.out.println("Enter Email Address: ");
			this.emailAddress=scanner.nextLine();

			System.out.println("Enter Physical Address: ");
			this.physicalAddress=scanner.nextLine();
			
			System.out.println("Enter Employment Status: ");
			this.employmentStatus=scanner.nextLine();
			
			System.out.println("Enter Monthly Income: ");
			this.monthlyIncome=scanner.nextDouble();
			scanner.nextLine();

			this.customerStatus="ACTIVE";

            saveCustomerToFile();
		}


public void saveCustomerToFile() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("customer.txt", true))) {

            writer.write(
             customerId + "," + firstName + "," +lastName + "," +
           nationalId + "," + emailAddress + "," + physicalAddress + "," +
            employmentStatus + "," + phoneNumber + "," + monthlyIncome + "," + customerStatus
            );

            writer.newLine();
            System.out.println("Customer Saved Successfully");

        } catch (IOException e) {
            System.out.println("Customer Not Saved: " + e.getMessage());
        }
}


		public void searchCustomer(){

		   Scanner scanner = new Scanner(System.in);

			System.out.println("************************************************************************************");
			System.out.println("===== SEARCH CUSTOMER BY CUSTOMER ID, NAME, PHONE OR NATIONAL ID ===== ");
			System.out.println("*************************************************************************************");
			System.out.println("SEARCH CUSTOMER: ");
			String searchValue = scanner.nextLine();

			try (BufferedReader reader = new BufferedReader( new FileReader("customer.txt"))) {

				String line;

				while ((line = reader.readLine()) != null) {

					String[] data = line.split(",");

					if (
							data[0].equalsIgnoreCase(searchValue) ||
							data[1].equalsIgnoreCase(searchValue) ||
							data[2].equalsIgnoreCase(searchValue) ||
							data[3].equalsIgnoreCase(searchValue) ||
							data[4].equalsIgnoreCase(searchValue)
					) {
						System.out.println("************************");
						System.out.println("CUSTOMER FOUND!");
						System.out.println("************************");
						System.out.println("ID: " + data[0]);
						System.out.println("FirstName: " + data[1]);
						System.out.println("LastName: " + data[2]);
						System.out.println("NationalID: " + data[3]);
						System.out.println("Phone: " + data[4]);
						System.out.println("Email: " + data[5]);
						System.out.println("PhysicalAddress: " + data[6]);
						System.out.println("EmployementStatus: " + data[7]);
						System.out.println("Income: " + data[8]);

						return;
					}
				}
				System.out.println("Customer not Found!!");

			} catch (IOException e) {
				System.out.println("Error Reading Customer File: " + e.getMessage());
			}
		}

		public void viewAllCustomers(){
			try {
				BufferedReader reader = new BufferedReader( new FileReader("customer.txt"));
				String line;

				System.out.println("***************************");
				System.out.println("==== ALL CUSTOMER LIST =====");
				System.out.println("***************************");
				System.out.println("                                                                                         ");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("ID| f.Name| l.Name| NationalID| Phone| Email| Locatiion| Employement| Income | Status");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("                                                                                         ");

				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}

				reader.close();
			} catch (IOException e) {
				System.out.println("Error Reading Customers: " + e.getMessage());
			}
		}
}

		// C:\Users\GAMER\Documents\GitHub\Loan-Management-System\loan-management-app
