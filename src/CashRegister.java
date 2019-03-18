import items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CashRegister {
	
	private Map<Integer, ProcessedItem> _processedItems;
	private ArrayList<Coupon> _coupons;
	
	public CashRegister() {
		System.out.println("Creating a new Cash Register");

		_processedItems 	= new HashMap<Integer, ProcessedItem>();
		_coupons 			= new ArrayList<Coupon>();
	}
	

	public double scanItem(CartItem cItem) {
		
		// Will check is items type already exists in the processed Item.
		ProcessedItem existingItem = _processedItems.get(cItem.item().uniqueID());
		
		if (existingItem == null) {
			// Item does not exist create new processedItem and add it to processed items.
			ProcessedItem pItem = new ProcessedItem(cItem.item(), cItem.quantity()); 

			_processedItems.put(cItem.item().uniqueID(), pItem);
		} else {
			// Item exists so 
			existingItem.updateQuantity(cItem.quantity());
		} 
		
		return getTotal();
	} 
	
	public boolean removeItemAll(Item item) {
		_processedItems.remove(item.uniqueID());

		return true;
		
	}
	
	public boolean removeItem(Item item, double rQuantity) {
		ProcessedItem pItem 	= _processedItems.get(item.uniqueID()); 
		
		if (pItem != null) {
			double newQuantity 		= pItem.getQuantity() - rQuantity;

			if (newQuantity > 0) {
				_processedItems.get(item.uniqueID()).setQuantity(newQuantity);
				return true;
			} else if (newQuantity == 0){
				_processedItems.remove(item.uniqueID());
				return true;
			}
		}
		
		return false;
	}

	public double getTotal() {
		double total 	= 0;

		for (ProcessedItem pItem : _processedItems.values()) {
			total 		+= pItem.getItem().getPrice(pItem.getQuantity()); 
		}
		
		for (Coupon coup : _coupons) {
			if (coup.isValid(total)) {
				total 	= coup.getUpdatePrice(total);
			}
		}
		
		return total;
	}
	
	public void applyCoupon(Coupon coup) {
		_coupons.add(coup); 

	}
	
	public void checkout() {
		
	}
	
	public double pay(double amount) {
		double change = 0;
		
		change = getTotal() - amount; 
		return change;
	}
	
	public void cancel() {

		
	}


}
