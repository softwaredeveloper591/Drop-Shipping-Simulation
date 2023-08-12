package Business;

public class SalesQuery {
	
	
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
		System.out.println("1-) "+ maxProfitableSales.getProduct().toString()+"-> "+ maxProfitableSales.getProfitInInteger()+" profit");
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
}
