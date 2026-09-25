package group1;

public class BusinessLoan extends Loan {
	
	public BusinessLoan(double principal,double interestRate,int repaymentPeriod) {
			super(principal,interestRate,repaymentPeriod);
		}
		@Override
		public double  calculateInterest() {
			return principal  * (interestRate / 100) * repaymentPeriod;
		
				
			}
		
		public static void main(String[] args){
			PersonalLoan loan = new PersonalLoan(500000,15,24);
			loan.displayLoanDetails();
			
			System.out.println("Interent only: " + loan.calculateInterest());
			System.out.println("Total Payable: " + loan.calculateTotalPayable());}
		}
		
			

		
