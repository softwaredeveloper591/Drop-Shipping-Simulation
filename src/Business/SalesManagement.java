package Business;

public class SalesManagement {
	private Sales[][] salesForAllSupplierSales;

	public SalesManagement(Sales[] salesOfSupplier1,Sales[] salesOfSupplier2,Sales[] salesOfSupplier3) {
		salesForAllSupplierSales = new Sales[3][];
		salesForAllSupplierSales[0]=salesOfSupplier1;
		salesForAllSupplierSales[1]=salesOfSupplier2;
		salesForAllSupplierSales[2]=salesOfSupplier3;
	}	
	
	public Sales[][] getSalesForAllSupplierSales(){   // Burada bir privacy leak düzeltmesi gerekli
		return salesForAllSupplierSales;
	}
	
}
