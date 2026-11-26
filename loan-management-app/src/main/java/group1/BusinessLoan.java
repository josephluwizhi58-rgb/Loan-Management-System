package group1;

public class BusinessLoan extends Loan { 
  private String businessName;
	public static final double intestRate = 12.0;
	public static final int maxPeriodMonths = 24;
	public static final double minAmount = 100000;
	public static final double mixAmount = 1000000;

	public BusinessLoan(double principal,double interestRate,int repaymentPeriod,String businessName) {
		super(principal,interestRate,repaymentPeriod);
		this.businessName=businessName;
	}
	@Override
	public double  calculateInterest() {
		return principal  * (interestRate / 100) * repaymentPeriod;
	}
	
	/* public BusinessLoan(double principal,double interestRate,int repaymentPeriod) {
public class BusinessLoan extends Loan {
	*/
}

			

		
