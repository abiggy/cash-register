import java.util.ArrayList;
import java.util.Iterator;

import items.Item;


public class Cart implements Iterable<CartItem> {
	
	private ArrayList<CartItem> cart;
	
	public Cart() {
		cart 	= new ArrayList<CartItem>();
		
	}
	
	public Boolean addItem(Item item, double quantity) {
		cart.add(new CartItem(item, quantity));
		
		return true;
	}

	@Override
	public Iterator<CartItem> iterator() {
		Iterator<CartItem> cartIterator 	= new Iterator<CartItem>() {
			private int index = 0;
			
			public boolean hasNext() {
				return index < cart.size(); 
			}
			
			public CartItem next() {
				return cart.get(index++);
			}
			
			public void remove() {
				
			}
		};
		return cartIterator;
	}

}
