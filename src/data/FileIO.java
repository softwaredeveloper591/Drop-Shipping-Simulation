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
			read.nextLine();    //getting rid of first line because info in the files starts at second line
			while(read.hasNextLine()) {
				temporaryArray[count]=read.nextLine();
				System.out.println(temporaryArray[count]);
				count++;
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: "+ path);
		}
		actualArray= new String[count];
		for(int i=0; i<count;i++) {  
			actualArray[i]=temporaryArray[i];
		}
		return actualArray;
	}
	
	
	
	
	
	
 
	

}
