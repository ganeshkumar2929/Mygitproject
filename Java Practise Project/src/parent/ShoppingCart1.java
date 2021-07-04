package parent;

import java.util.ArrayList;

public class ShoppingCart1 {
	ArrayList<ShoppingCartItem1> items = new ArrayList<ShoppingCartItem1>();
	
	//add item Method
	public void addItem(ShoppingCartItem1 a) {
		items.add(a);
	}
	
	//No .of items
	public int itemSize() {
		return items.size();
	}
	
	//total value of the cart
	public double cartValue() {
			double CartTotal=0;
		for(int i=0; i<items.size(); i++) {
			ShoppingCartItem1 x = items.get(i);
			 CartTotal= CartTotal + x.getQuantity()*x.getPrice();
		}
		return CartTotal;
	}
	
	//Total quantites of the cart
	public int cartQuantity() {
			int y=0;
		for(int i =0; i<items.size(); i++) {
			ShoppingCartItem1 x = items.get(i);
			 y=y + x.getQuantity();
			}
		return y;
		
	}
	
	public static void main(String[] args) {
		ShoppingCart1 testShoppingCart= new ShoppingCart1();
		ShoppingCartItem1 sugar = new ShoppingCartItem1();
		testShoppingCart.addItem(sugar);
		sugar.setPrice(96.70);
		sugar.setQuantity(3);
		ShoppingCartItem1 oil = new ShoppingCartItem1();
		testShoppingCart.addItem(oil);
		oil.setPrice(250.55);
		oil.setQuantity(2);
		System.out.println(testShoppingCart.cartValue());
		System.out.println(testShoppingCart.itemSize());
		System.out.println(testShoppingCart.cartQuantity());
		
		
	}
}
