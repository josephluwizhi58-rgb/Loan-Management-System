package group1;


	public class EducationLoan extends Loan{
		private String passcode;
		private String institutionName;
		
		
		public EducationLoan(double principal,double interestRate,int repaymentPeriod,String passcode, String institutionName) {
				super(principal,interestRate,repaymentPeriod);
				this.passcode = passcode;
				this.institutionName = institutionName;
			}
			@Override
			public double  calculateInterest() {
				return principal  * (interestRate / 100) * (repaymentPeriod /12.0);	
				}
	}


