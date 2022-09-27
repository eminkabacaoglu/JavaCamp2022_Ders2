package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3); 
		
		
		Product product2 = new Product(2,"Tablet","Samsung Tablet",2000,4);
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product);
		System.out.println("Product Code: "+product.getCode());
		
		productManager.add(product2);
		System.out.println("Product Code: "+product2.getCode());

	}

}
