package data;
import java.util.StringTokenizer;

import Business.Customer;
import Business.Product;
import Business.Sales;
import Business.Supplier;

public class DataManagement {
	
	public static Customer[] loadCustomersToAnArray(String pathToCustomers) {
		Customer[] tempCustomers = new Customer[100];
		Customer[] actualCustomers;
		String[] customerStrings= FileIO.readFrom(pathToCustomers);
		int numberOfCustomers=0;
		for(String eachCustomerString: customerStrings) {
			StringTokenizer tokenizer= new StringTokenizer(eachCustomerString, ",\n");
			String id =tokenizer.nextToken();
			String name=tokenizer.nextToken();
			String email =tokenizer.nextToken();
			String country=tokenizer.nextToken();
			String address=tokenizer.nextToken();
			
			tempCustomers[numberOfCustomers]= new Customer(id,name,email,country,address);
			numberOfCustomers++;
		}
		actualCustomers=new Customer[numberOfCustomers];
		for(int i=0; i<numberOfCustomers; i++) {
			actualCustomers[i]=tempCustomers[i];
		}
		return actualCustomers;
	}
	
	public static Product[] loadProductsToAnArray(String pathToProducts) {
		Product[] tempProducts = new Product[100];
		Product[] actualProducts;
		String[] productStrings= FileIO.readFrom(pathToProducts);
		int numberOfProducts=0;
		for(String eachProductString: productStrings) {
			StringTokenizer tokenizer= new StringTokenizer(eachProductString,",");
			String id=tokenizer.nextToken();
			String title=tokenizer.nextToken();
			Double rate=Double.parseDouble(tokenizer.nextToken());
			int numberOfReviews=Integer.parseInt(tokenizer.nextToken());
			int price=Integer.parseInt(tokenizer.nextToken());
			tempProducts[numberOfProducts]= new Product(id, title,rate,numberOfReviews ,price );
			numberOfProducts++;
		}
		actualProducts=new Product[numberOfProducts];
		for(int i=0; i<numberOfProducts; i++) {
			actualProducts[i]=tempProducts[i];
		}
		return actualProducts;
	}
	
	public static Sales[] loadSalesToAnArray(Customer[] customers,Supplier supplier,String pathToSales) {
		Product[] products=supplier.getProducts();
		Sales[] tempSaless = new Sales[100];
		Sales[] actualSales;
		String[] salesStrings = FileIO.readFrom(pathToSales);
		int numberOfSaless=0;
		for(String eachSalesString: salesStrings) {
			StringTokenizer tokenizer= new StringTokenizer(eachSalesString,",");
			String salesID=tokenizer.nextToken();
			String customerID= tokenizer.nextToken();
			String productID=tokenizer.nextToken();
			String salesDate=tokenizer.nextToken();
			Customer customer=findCustomer(customerID, customers);
			Product product = findProduct(productID, products);
			tempSaless[numberOfSaless]= new Sales(salesID,customer,product,salesDate );
			numberOfSaless++;
		}
		actualSales=new Sales[numberOfSaless];
		for(int i=0; i<numberOfSaless; i++) {
			actualSales[i]=tempSaless[i];
		}
		return actualSales;
	}
	
	
	private static Customer findCustomer(String customerID, Customer[] customers) {
		Customer foundCustomer = null;
		for(Customer customer:customers) {
			if (customerID.equals(customer.getId()))
				foundCustomer=customer;
		}
		return foundCustomer;
	}
	
	private static Product findProduct(String productID, Product[] products) {
		Product foundProduct = null;
		for(Product product:products) {
			if (productID.equals(product.getId()))
				foundProduct=new Product(product);
		}
		return new Product(foundProduct);
	}

}
