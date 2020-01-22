
package icp_java_challenge_1;

public class Item {
	private String name;
	private int quantity;
	private float price;
	
	public Item(String name , int quant , float price) {
		
		this.name = name;
		this.quantity = quant;
		this.price= price;
		
	}
	// Get the details of the items
	public String getItem() {
		return String.format("Product name is %s with %d remaining and its price is GHC %f",name,quantity,price);
	}
	// Set the name of the item
	public void setName(String  name) {
		this.name =name;

	}
	// Set the quantity of the item
	public void setQuantity(int quant) {
		this.quantity =quant;
	}
	// Set the price of the item
	public void setPrice(int price) {
		this.price =price;
	}
	// Get the name of the item
	public String getName() {
		return name;
	}
	// Get the quantity of the item
	public int getQuantity() {
		return quantity;
	}
	// Set the price of the item
	public float getPrice() {
		return price;
	}
	
}
