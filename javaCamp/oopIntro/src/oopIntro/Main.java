package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo", 1500,"16 GB Ram", 10);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("HP");
		product2.setDetail("8 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(18000);
		
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product[] products = {product1, product2};
		
		for (Product product : products) {
			
			System.out.println(product.getName());
		}
		
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("computer");
		
		
		System.out.println(category1.getName());
		
		
		
	}

}
