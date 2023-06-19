package Bai6;

public class AccountDemo {
	    public static void main(String[] args) {
	        try {
	            Account account1 = new Account(12345, "Cuong", 600000);
	            System.out.println(account1);
	            boolean depositSuccess = account1.deposite(10000);
	            System.out.println("Deposit success: " + depositSuccess);
	            System.out.println(account1);
	            boolean withdrawSuccess = account1.withdraw(10, 100);
	            System.out.println("Withdraw success: " + withdrawSuccess);
	            System.out.println(account1);
	            account1.addInterest();
	            System.out.println(account1);
	            Account account2 = new Account(54321, "Vu");
	            System.out.println(account2);
	            boolean transferSuccess = account1.transper(account2, 10000000);
	            System.out.println("Transfer success: " + transferSuccess);
	            System.out.println(account1);
	            System.out.println(account2);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
