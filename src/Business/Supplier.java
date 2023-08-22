package Business;

public class Supplier {
	private Product[] products;
	
	public Supplier(Product[] products) {
		this.products= products;
	}
	
	public int getNumberOfProducts() { return products.length;}

	public Product[] getProducts() {
		Product[] copyProducts= new Product[getNumberOfProducts()];
		int index=0;
		for(Product product:products) {
			copyProducts[index]=new Product(product);
			index++;
		}
		return copyProducts;
	}
	
	
	

}
