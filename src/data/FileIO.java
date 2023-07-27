package data;
import java.util.Scanner;
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
	
	
	
	
	
	
 
	

}
