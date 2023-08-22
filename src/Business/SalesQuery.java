package Business;

public class SalesQuery {
	
	/**
	 * calculates most profitable product by visiting all the sales in SalesManagement
	 * @param salesManagement
	 */
	public static void mostProfitableProduct(SalesManagement salesManagement) {
		int maxProfit=0;
		Sales maxProfitableSales=null;
		
		for (Sales[] salesArray : salesManagement.getSalesForAllSupplierSales()) {
			for (Sales sales : salesArray) {
				int profit=sales.getProfitInInteger();
				if (profit>maxProfit) {
					maxProfit=profit;
					maxProfitableSales=sales;
				}
			}
		}
		System.out.println("1-) "+ maxProfitableSales.getProduct().toString()+"-> "+ maxProfitableSales.getProfitInInteger()+" TL profit");
	}
	
	public static void mostExpensiveProduct(SalesManagement salesManagement) {
		int maxPrice=0;
		Sales maxExpensiveSales=null;
		
		for (Sales[] salesArray : salesManagement.getSalesForAllSupplierSales()) {
			for (Sales sales : salesArray) {
				int price=(int)sales.getSalesPrice();
				if (price>maxPrice) {
					maxPrice=price;
					maxExpensiveSales=sales;
				}
			}
		}
		System.out.println("2-) "+ maxExpensiveSales.getProduct().toString()+"-> with sales price "+ maxExpensiveSales.getSalesPrice());
	}
	
	public static void customerWhoPurchasedMostProduct(Customer[] customers) {
		int maxPurchase=0;
		Customer maxCustomer=null;
		for (Customer customer : customers) {
			int numberOfPurchases=customer.getNumberOfPurchases();
			if (numberOfPurchases>maxPurchase) {
					maxPurchase=numberOfPurchases;
					maxCustomer=customer;
			}
		}
		System.out.println("3-) "+maxCustomer.toString());
	}
	
	public static void totalProfitFromAllSales() {System.out.println("4-) "+Sales.getTotalProfitFromAllSales()+" TL");}
	
	public static void leastProfitableProductofSupplier(SalesManagement salesManagement, int supplierNo) {
		Sales[] salesArrayOfSupplier=salesManagement.getSalesForAllSupplierSales()[supplierNo-1];
		int leastProfit= salesArrayOfSupplier[0].getProfitInInteger();
		Sales leastProfitableSales=null;
		
		
		for (Sales sales : salesArrayOfSupplier) {
			int profit=sales.getProfitInInteger();
			if (profit<leastProfit) {
				leastProfit=profit;
				leastProfitableSales=sales;
			}
		}
		
		System.out.println("5-) "+ leastProfitableSales.getProduct().toString()+"-> "+ leastProfitableSales.getProfitInInteger()+" TL profit");
	}
	
}
