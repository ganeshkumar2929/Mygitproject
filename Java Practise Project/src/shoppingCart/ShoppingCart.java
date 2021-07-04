package shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<ShoppingcartItem> items = new ArrayList<ShoppingcartItem>();
	double totalPriceOfCart;
	double taxAmount;
	double subTotal;
	
	
	public double gettotalPriceOfCart() {
		return totalPriceOfCart;
	}
	
	public void settotalPriceOfCart(double totalPriceOfCart) {
		this.totalPriceOfCart=totalPriceOfCart;
	}
	
	public double gettaxAmount() {
		return taxAmount;
	}
	
	public void settaxAmount(double taxAmount) {
		this.taxAmount=taxAmount;
	}
	
	public double getsubTotal() {
		return subTotal;
	}
	
	public void setsubTotal(double subTotal) {
		this.subTotal=subTotal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
