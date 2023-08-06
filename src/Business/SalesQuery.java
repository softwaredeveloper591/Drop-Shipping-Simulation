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
		System.out.print(maxProfit);
	}
}
