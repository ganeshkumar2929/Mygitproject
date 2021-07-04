package parent;

import java.util.ArrayList;

public class ShoppingCart{
	ArrayList<ShoppingCartItem> items = new ArrayList<ShoppingCartItem>();
	Taxcalculator taxcalculator = new Taxcalculator();

	
	//add item method 
	public void addItem(ShoppingCartItem a) {
		items.add(a);
	}
	
	//total value of cart
/*Note in the gettotal amount method you need to call the tax calculator calculate method and send the total price of the cart*/
//Now add the returned tax value from the calculate method to the order total and return it as the value of gettotalamount method
	
	
	
	
	public double getTotalAmount() {
		double cartTotal = 0;
		for(int i=0; i<items.size(); i++) {
			ShoppingCartItem x = items.get(i);
			cartTotal = cartTotal + x.getItemPrice()*x.getItemQuantity();
			}
		
		return cartTotal+taxcalculator.calculateTax(this);
			}
	

	
	
	//No.of items in the cart
	public int totalCartItem() {
		return items.size();
	}
	
	public static void main(String[] args) {
		ShoppingCart shoppingCart1 = new ShoppingCart();
		ShoppingCartItem sugar = new ShoppingCartItem();
		sugar.setItemPrice(10);
		sugar.setItemQuantity(3);
		shoppingCart1.addItem(sugar);
		ShoppingCartItem rice = new ShoppingCartItem();
		shoppingCart1.addItem(rice);
		rice.setItemPrice(20);
		rice.setItemQuantity(2);
		System.out.println(shoppingCart1.getTotalAmount());
		System.out.println(shoppingCart1.totalCartItem());
		
	}
	
}
