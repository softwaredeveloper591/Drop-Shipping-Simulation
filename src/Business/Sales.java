package Business;

public class Sales {
	
	private String id;
	private Customer customer;
	private Product product;
	private String salesDate;
	private double salesPrice;
	private int profit;
	private static int totalProfitFromAllSales;


public Sales(String id, Customer customer, Product product, String salesDate) {
	this.id = id;
	customer.increaseNumberOfPurchases();
	this.customer=customer;
	this.product = product;
	this.salesDate = salesDate;
	this.salesPrice= calculateSalesPrice(product);
	this.profit=(int)salesPrice-product.getPrice();
	Sales.totalProfitFromAllSales+=profit;
}

public Sales(Sales otherSales) {
	this.id = otherSales.id;
	this.customer = new Customer(otherSales.customer);
	this.product = new Product(otherSales.product);
	this.salesDate = otherSales.salesDate;
	this.salesPrice = otherSales.salesPrice;
	this.profit=otherSales.profit;
	
}

private double calculateSalesPrice(Product product) {
	double price= product.getPrice()+((product.getRate())/5.0*100)*product.getNumberOfReviews();	
	return price;
}


public String getId() {	return id;}
public void setId(String id) {	this.id = id;}

public Customer getCustomer() {	return new Customer(customer);}
public void setCustomer(Customer customer) {	this.customer = customer;}


public Product getProduct() {	return new Product(product);}
public void setProduct(Product product) {	this.product = product;}

public String getSalesDate() {	return salesDate; }
public void setSalesDate(String salesDate) {	this.salesDate = salesDate;}

public double getSalesPrice() {	return salesPrice;}
public void setSalesPrice(int salesPrice) {	this.salesPrice = salesPrice;}

public int getProfitInInteger() {return profit;}

public static int getTotalProfitFromAllSales() {return totalProfitFromAllSales;}

}
