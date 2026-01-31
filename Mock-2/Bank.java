package practiceDay31_1_2026Interview;

import java.util.Scanner;

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	
	
	private double balance;
	
	public Bank(double balance){
		this.balance = balance;
		System.out.println("Balance : "+ balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    public void depositBank() {
		System.out.print("Enter amout to deposit : ");
		int a = sc.nextInt();
		balance = balance + a;
		System.out.println("Amount deposited total balance is : " + balance);
	}
	
	public void withdrawBank() {
		System.out.print("Enter amount to withdraw : ");
		int b = sc.nextInt();
		balance = balance - b;
		System.out.println("Amount withdrawn successfully");
		
	}
	
	public void checkBalance() {
		System.out.print( balance);
	}
	
	

}
