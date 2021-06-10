package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new EmailLogger(), new FileLogger()};  
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer dzhansu = new Customer(1, "Dzhansu", "Halim");
		
		customerManager.add(dzhansu);
		

	}

}
