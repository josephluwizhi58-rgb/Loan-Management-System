package group1;

public abstract class Loan {
	protected double principal;
	protected double interestRate;
	protected int repaymentPeriod;
	
	public Loan (double principal, double interestRate, int repaymentPeriod) {
		this.principal = principal;
		this.interestRate = interestRate;
		this.repaymentPeriod = repaymentPeriod;
		
	
	}
	
	public abstract double calculateInterest();
	
	public double calculateTotalPayable() {
		return principal + calculateInterest();
	}
	
	public void displayLoanDetails() {
		System.out.println("Loan amount: " + principal);
		System.out.println("Interest: " + calculateInterest());
		System.out.println("Total amount payable: MWK " + calculateTotalPayable());
	}
	
}
