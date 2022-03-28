package week5.day2;

public class Bank extends SBI implements Cibil{
	public void cibilScore()
	{
		System.out.println("check your cibil score here");
	}
	public void maximumLoanAmount()
	{
		System.out.println("maximum loan amount");
	}
	
	public void creditScore()
	{
		System.out.println("credit score");
	}
	public void minimumBalance()
	{
		System.out.println("minimum balance");
	}
	
	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("this is your bank balance page");
	}
	@Override
	public void maximunLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("this is your max loan amount applicable");
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank obj=new Bank();
obj.cibilScore();
obj.maximumLoanAmount();
obj.maximunLoanAmount();
obj.bankBalance();
obj.creditScore();
obj.ITLoan();
obj.minimumBalance();


	}

}
