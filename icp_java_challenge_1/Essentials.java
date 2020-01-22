package icp_java_challenge_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Essentials {
	public static void main(String[] args) {
		// Define the file writer variables
		PrintWriter main = null;
		PrintWriter backup = null;
		
		// Assign the main and backup files
		try {
			
			main = new PrintWriter(new FileOutputStream("essentials_store.txt", true));
			backup = new PrintWriter(new FileOutputStream("backup_essentials_store.txt", true)); 
			
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
		// Define the item property variables
		String name;
		int quant;
		float price;
		
		// Define the input variable
		Scanner input = new Scanner(System.in);
		
		// Collect the info of 10 items
		for(int i = 0 ; i< 10;i++) {
			System.out.println("Enter item name: ");
			// Take the string input for the name
			name=input.next();
		
			System.out.println("Enter item quantity: ");
			// Take the integer input 
			quant = input.nextInt();
			
			System.out.println("Enter item price");
			// Take the float input
			price = input.nextFloat();
			
			// Create an item from the inputs
			Item item = new Item(name,quant,price);
			
			System.out.println();
			
			// Write the item details in the main and backup files
			main.println(item.getItem());
			backup.println(item.getItem());
		}
		// Close the files
		main.close();
		backup.close();
	}
}
