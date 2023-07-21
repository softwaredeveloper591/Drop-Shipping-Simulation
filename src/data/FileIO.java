package data;
import java.util.Scanner;
import java.util.StringTokenizer;

import Business.Customer;
import Business.Product;
import Business.Sales;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileIO {
	
	public static String[] readFrom(String path) {
		String[] temporaryArray= new String[100];
		String[] actualArray;
		Scanner read;
		int count=0;
		try {
			read = new Scanner(new FileInputStream(path));
			while(read.hasNext()) {
				temporaryArray[count]=read.next();
				count++;
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: "+ path);
		}
		actualArray= new String[count-1];
		for(int i=1; i<=count;i++) {  //it begins from 1 because the necessary info in the file starts at second line
			actualArray[i-1]=temporaryArray[i];
		}
		return actualArray;
	}
	
	public static Customer[] loadCustomersToAnArray(String pathToCustomers) {
		Customer[] tempCustomers = new Customer[100];
		Customer[] actualCustomers;
		String[] customerStrings= readFrom(pathToCustomers);
		int numberOfCustomers=0;
		for(String eachCustomerString: customerStrings) {
			StringTokenizer tokenizer= new StringTokenizer(eachCustomerString);
			tempCustomers[numberOfCustomers]= new Customer(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
			numberOfCustomers++;
		}
		actualCustomers=new Customer[numberOfCustomers];
		for(int i=0; i<=numberOfCustomers; i++) {
			actualCustomers[i]=tempCustomers[i];
		}
		return actualCustomers;
	}
	
	public static Product[] loadProductsToAnArray(String pathToProducts) {
		Product[] tempProducts = new Product[100];
		Product[] actualProducts;
		String[] productStrings= readFrom(pathToProducts);
		int numberOfProducts=0;
		for(String eachProductString: productStrings) {
			StringTokenizer tokenizer= new StringTokenizer(eachProductString);
			tempProducts[numberOfProducts]= new Product(tokenizer.nextToken(), tokenizer.nextToken(),Double.parseDouble(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()));
			numberOfProducts++;
		}
		actualProducts=new Product[numberOfProducts];
		for(int i=0; i<=numberOfProducts; i++) {
			actualProducts[i]=tempProducts[i];
		}
		return actualProducts;
	}
	
	public static Sales[] loadSalessToAnArray(String pathToSaless) {
		Sales[] tempSaless = new Sales[100];
		Sales[] actualSales;
		String[] salesStrings= readFrom(pathToSaless);
		int numberOfSaless=0;
		for(String eachSalesString: salesStrings) {
			StringTokenizer tokenizer= new StringTokenizer(eachSalesString);
			tempSaless[numberOfSaless]= new Sales(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
			numberOfSaless++;
		}
		actualSales=new Sales[numberOfSaless];
		for(int i=0; i<=numberOfSaless; i++) {
			actualSales[i]=tempSaless[i];
		}
		return actualSales;
	}
	
	
	
	
 
	

}
