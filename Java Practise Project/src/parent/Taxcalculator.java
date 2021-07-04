package parent;

public class Taxcalculator {

	public double calculateTax(ShoppingCart sC) {
		double cartTotal=0;
		for(int i=0; i<sC.items.size(); i++) {
			ShoppingCartItem x =sC.items.get(i);
			cartTotal = cartTotal + x.getItemPrice()*x.getItemQuantity();
		}
		return cartTotal*0.1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
