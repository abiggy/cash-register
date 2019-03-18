package promo;
import items.Item;


public class TwoForOnePromo implements Promo {
	private Item _item;
	private String _name 	= "*BUY 2 GET 1 FREE*";

	public TwoForOnePromo(Item item) {
		_item = item;
	}
	
	@Override
	public int uniqueID() {
		return _item.uniqueID();
	}

	@Override
	public double getPrice(double quantity) {
		int offPrice 		= (int) Math.floor(quantity / 2);
		int normalPrice 	= (int) (quantity - offPrice); 
		
		double itemPrice = _item.getPrice(normalPrice);
		
		return itemPrice;
	}

	@Override
	public String getName() {
		return _item.getName() + " " + _name;
	}

	@Override
	public boolean qualify(double quantity) {
		if (quantity >= 2) {
			return true;
		} else {
			return false;
		}
	}

}
