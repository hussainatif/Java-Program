class BankAccount{
	public String depositor;
	public String accountType;
	public int accountNo;
 	public float balanceRemaining;
 	public void initializeBankAcount(String depositor,String accountType,
 		int accountNo,float balanceRemaining){
 		this.depositor=depositor;
 		this.accountType=accountType;
 		this.accountNo=accountNo;
 		this.balanceRemaining=balanceRemaining;
 	}
 	public void depositeAmount(float amount){
 		balanceRemaining+=amount;
 		
 		System.out.println("\nYou Have Successfully Deposited "+amount+" Rs To Your Account.");
 		
 	}
 	public void withdrawlAmount(float amount){
 		if(balanceRemaining>2000&&balanceRemaining>=amount){
 			balanceRemaining-=amount;
 			
 			System.out.println("\nYou Have Withdrawl "+amount+" Rs From Your Account.");
 			
 		}
 		else{
 			
 			System.out.println("\nSorry ! ...You Don't Have Enough Amount !");
 		
 		}
 	}
 	public void displayDetails(){
 		System.out.println("*******************************************************");
 		System.out.println("Depositor Name : "+depositor+"\nAccount Type : "+
 			accountType+"\nAccount No. : "+accountNo+"\nRemaining Balance : "+balanceRemaining);
 		System.out.println("*******************************************************");

 	}
 	public void getInterestRateByTimePeriod(float time){
 		if(this.getClass().getName()=="SavingAccount"){
	 		System.out.println("*******************************************************");
			System.out.println("Interest Of Your Saving Account At Rate(4%) And Time Period("+time+" Years) Is : "
				+(this.balanceRemaining*0.04f*time));
			System.out.println("*******************************************************");
 		}
 		else{
 			System.out.println("*******************************************************");
 			System.out.println("Oops ! ...You Are Having A Current Account !");
 			System.out.println("No Interest On This Type Of Account !!!");
 			System.out.println("*******************************************************");
 		}
	}
}
	
class SavingAccount extends BankAccount{
	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount();
		savingAccount.initializeBankAcount("Atif","Savings",64321,30000);
		savingAccount.displayDetails();
		savingAccount.withdrawlAmount(9000);
		savingAccount.displayDetails();	
		savingAccount.depositeAmount(25000);
		savingAccount.displayDetails();
		savingAccount.getInterestRateByTimePeriod(3);
	}
}
	
class CurrentAccount extends BankAccount{
		public static void main(String[] args) {
			CurrentAccount currentAccount=new CurrentAccount();
			currentAccount.initializeBankAcount("Asif","Current",12345,40000);
			currentAccount.displayDetails();
			currentAccount.withdrawlAmount(80000);
			currentAccount.displayDetails();
			currentAccount.getInterestRateByTimePeriod(2);
		}
}













