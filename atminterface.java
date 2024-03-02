package tasks;


	import java.util.Scanner;

	public class atminterface {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        ATM atm = new ATM();

	       
	        System.out.println("Welcome to the ATM");
	        System.out.print("Enter User ID: ");
	        int userId = scanner.nextInt();
	        System.out.print("Enter PIN: ");
	        int pin = scanner.nextInt();

	       
	        User user = atm.authenticateUser(userId, pin);
	        if (user == null) {
	            System.out.println("Invalid User ID or PIN. Exiting...");
	            return;
	        }

	       
	        int choice;
	        do {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. View Transactions History");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Transfer");
	            System.out.println("5. Quit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    user.viewTransactionHistory();
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    double amount = scanner.nextDouble();
	                    user.withdraw(amount);
	                    break;
	                case 3:
	                    System.out.print("Enter deposit amount: ");
	                    amount = scanner.nextDouble();
	                    user.deposit(amount);
	                    break;
	                case 4:
	                    System.out.print("Enter recipient's user ID: ");
	                    int recipientId = scanner.nextInt();
	                    System.out.print("Enter transfer amount: ");
	                    amount = scanner.nextDouble();
	                    user.transfer(recipientId, amount);
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);
	    }
	}

	class ATM {
	   
	    public User authenticateUser(int userId, int pin) {
	        
	        return null;
	    }
	}

	class User {
	    private int userId;
	    private int pin;
	    private double balance;
	    

	    public User(int userId, int pin, double balance) {
	        this.userId = userId;
	        this.pin = pin;
	        this.balance = balance;
	    }

	    public void viewTransactionHistory() {
	       
	    }

	    public void withdraw(double amount) {
	        
	    }

	    public void deposit(double amount) {
	        
	    }

	    public void transfer(int recipientId, double amount) {
	        
	    }
	}

	class Transaction {
	    private int transactionId;
	    private int userId;
	    private String type;
	    private double amount;
	   

	    public Transaction(int transactionId, int userId, String type, double amount) {
	        this.transactionId = transactionId;
	        this.userId = userId;
	        this.type = type;
	        this.amount = amount;
	    }

	   
	}


