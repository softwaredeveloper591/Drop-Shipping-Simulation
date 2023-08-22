package Business;

public class Product {
private String id,title;
private Double rate;
private int numberOfReviews,price;


public Product(String id, String title, Double rate, int numberOfReviews,int price) {
	this.id = id;
	this.title = title;
	this.rate = rate;
	this.numberOfReviews = numberOfReviews;
	this.price=price;
}


public String getId() {	return id;}
public void setId(String id) {	this.id = id;}

public String getTitle() {	return title;}
public void setTitle(String title) {	this.title = title;}

public Double getRate() {	return rate;}
public void setRate(Double rate) {	this.rate = rate;}

public int getNumberOfReviews() {	return numberOfReviews;}
public void setNumberOfReviews(int numberOfReviews) {	this.numberOfReviews = numberOfReviews;}

public int getPrice() {	return price;}
public void setPrice(int price) {	this.price = price;}


public Product(Product otherProduct) {
	this.id = otherProduct.id;
	this.title = otherProduct.title;
	this.rate = otherProduct.rate;
	this.numberOfReviews = otherProduct.numberOfReviews;
	this.price = otherProduct.price;
}
public String toString() {
	return id+" "+title+" "+ rate+ " "+ numberOfReviews+" "+ price;
}

}
