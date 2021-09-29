
public class BankAccount {
	private
	 String ownerName; 
	 float amount;
	 String status;
	 int accountType;
	 String city , state;
	 int pinCode;
	 
	 
	 public BankAccount(String ownerName , int accountType)
	 {
		 this.ownerName = ownerName;
		 this.accountType = accountType;
	 }
	 
	 public void setAddress(String city , String state , int pinCode)
	 {
		 this.city = city;
		 this.state = state;
		 this.pinCode = pinCode;
	 }
	 
	 public void getAddress()
	 {
		 System.out.println("The Address is : " + city  + " , " + state + " , " + pinCode);
	 }
	 
	 public void deposit(float amount)
	 {
		 this.amount+=amount;
		 System.out.println("AMOUNT HAS BEEN DEPOSITED ");
	 }
	 
	 public void withdraw(float amount)
	 {  if(this.amount>=amount)
	 {
		 this.amount-=amount;
		 System.out.println(amount+" HAS BEEN DEDUCTED ");
	 }
	 else
	 {
		 System.out.println("Insufficient Balance");
	 }
	 }
	 public void viewDetails()
	 {
		 System.out.println("Name : " + ownerName);
		 System.out.println("Address : " + city + " , " + state + " , " + pinCode);
		 if(accountType==0)
		 {
		 System.out.println("Account Type : " + "Savings");
		 }
		 else
		 {
			 System.out.println("Account Type : " + "Current");
		 }
	 }

	 public void checkBalance()
	 {
		 System.out.println("Available Balance : " + amount);
		 
	 }

}
