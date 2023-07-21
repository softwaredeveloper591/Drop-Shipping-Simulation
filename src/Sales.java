import java.util.Date;

public class Sales {
private String id;
private Customer customer;
private Product product;
private Date salesDate;
private int salesPrice;


public Sales(String id, Customer customer, Product product, Date salesDate, int salesPrice) {
	this.id = id;
	this.customer = customer;
	this.product = product;
	this.salesDate = salesDate;
	this.salesPrice = salesPrice;
}




public Sales(Sales otherSales ) {
	this(otherSales.getId(),otherSales.getCustomer(),otherSales.getProduct(),otherSales.getSalesDate(),otherSales.getSalesPrice());
}

public String getId() {	return id;}
public void setId(String id) {	this.id = id;}

public Customer getCustomer() {	return new Customer(customer);}
public void setCustomer(Customer customer) {	this.customer = customer;}


public Product getProduct() {	return new Product(product);}
public void setProduct(Product product) {	this.product = product;}

public Date getSalesDate() {	return new Date(salesDate.getTime()); }
public void setSalesDate(Date salesDate) {	this.salesDate = salesDate;}

public int getSalesPrice() {	return salesPrice;}
public void setSalesPrice(int salesPrice) {	this.salesPrice = salesPrice;}




}
