
public class Shop3 {
	public static void main(String[] args) {
		Product[] products = new Product[2];
		products[0] = new Product ();
		products[0].name = "Samsung Syncmaster";
		products[0].price = 700.0;
		
		products[1] = new Product ();
		products[1].name = "HP Probook 450";
		products[1].price = 3000.0;
		
		System.out.println("Produkty w sklepie: ");
		System.out.println(products[0].name + ":" + products[0].price);
		System.out.println(products[1].name + ":" + products[1].price);
	}

}
