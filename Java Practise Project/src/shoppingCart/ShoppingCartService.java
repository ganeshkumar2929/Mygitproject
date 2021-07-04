package shoppingCart;



public class ShoppingCartService {

	/*addtoCart method , return-void,arug1-shoppingCartObject arg2-itemname, qty and prices */
	//when an exisiting item added in the cart increase the quanitity alone in the cart 
	public void addToCart(ShoppingCart sC, String itemName, int quantity, int price ) {
		int addquantity=0;
		for(int i=0; i<sC.items.size(); i++) {
			ShoppingcartItem x =sC.items.get(i);
			if(x.equals(this)) {
			 addquantity = quantity +addquantity;
				
			}
		}
	}

	/*Calculatecartmethod, return-void, arg-ShoppingCart
Logic- add all the items price and set to subtotal 
From subtotal call taxcalculatorcalculatemethod
Then totalpriceofcart= subtotal+tax*/
	
	
public void calculateCart(ShoppingCart sC) {
	for(int i=0; i<sC.items.size(); i++) {
		ShoppingcartItem x =sC.items.get(i);
		subTotal=x.unitPrice;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
