package parent;

public class ShoppingCartItem {
	private String name;
	private double price;
	private int quantity;
	
	
	public String getItemName() {
		return name;
	}
	public void setItemName(String name) {
		this.name =name;
	}
	
	public double getItemPrice() {
		return price;
	}
	public void setItemPrice(double price) {
		this.price= price;
	}
	public int getItemQuantity() {
		return quantity;
	}
	public void setItemQuantity(int quantity) {
		this.quantity=quantity;
	}
}
