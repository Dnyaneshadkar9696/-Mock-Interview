package practiceDay31_1_2026Interview;

public class Bankcalling {
	
	public static void main(String[] args) {
		
		
		Bank ban = new Bank(1000);
		ban.depositBank();
		System.out.println();
		ban.withdrawBank();
		System.out.println();
		System.out.println("Reamining balance is : ");
		ban.checkBalance();
		
	}

}
