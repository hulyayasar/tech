package day26ProjectVendingMachine;

public class Runner {

	public static void main(String[] args) {
		double accountBalance=10;
		
		System.out.println("Hi welcome!...");
		System.out.println("your current balance: " + accountBalance);
		
		Products product = new Products();
		Methods method = new Methods();
		
		method.select(product);
		accountBalance=method.balance(product.getPrice(), accountBalance, product);
		method.purchase(product.getPrice(), accountBalance, product);

	}

}
