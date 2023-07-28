package app;
import Business.*;
import data.*;

public class DropShippingApp {

	public static void main(String[] args) {
		Customer[] customers=DataManagement.loadCustomersToAnArray("src/resources/Customers.csv");
		Supplier supplier_1= new Supplier(DataManagement.loadProductsToAnArray("src/resources/S1_Products.csv"));
		Supplier supplier_2= new Supplier(DataManagement.loadProductsToAnArray("src/resources/S2_Products.csv"));
		Supplier supplier_3= new Supplier(DataManagement.loadProductsToAnArray("src/resources/S3_Products.csv"));
		Sales[] salesOfSupplier1= DataManagement.loadSalesToAnArray(customers, supplier_1,"src/resources/S1_Sales.csv");
		Sales[] salesOfSupplier2= DataManagement.loadSalesToAnArray(customers, supplier_2,"src/resources/S2_Sales.csv");
		Sales[] salesOfSupplier3= DataManagement.loadSalesToAnArray(customers, supplier_3,"src/resources/S3_Sales.csv");
		SalesManagement salesManagement= new SalesManagement(salesOfSupplier1, salesOfSupplier2, salesOfSupplier3);

	}
}
