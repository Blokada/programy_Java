
public class Shop2 {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.name = "Samsung Syncmaster";
		product1.price = 700.0;
		
		Product product2 = new Product();
		product2.name = "HP Probook 450";
		product2.price = 3000.0;
		
		System.out.println("Produkty w sklepie: ");
		System.out.println(product1.name + ":" + product1.price);
		System.out.println(product2.name + ":" + product2.price);
	}

}
