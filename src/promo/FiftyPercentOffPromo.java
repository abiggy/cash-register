package promo;
import items.Item;


public class FiftyPercentOffPromo implements Promo {
	private Item _item;
	private String _name = "*50% OFF*";

	public FiftyPercentOffPromo(Item item) {
		_item = item;
	}
	
	@Override
	public int uniqueID() {
		// TODO Auto-generated method stub
		return _item.uniqueID();
	}

	@Override
	public double getPrice(double quantity) {
		
		double itemPrice = _item.getPrice(quantity);
		
		return itemPrice - (itemPrice * 0.50);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _item.getName() + " " + _name;
	}

	@Override
	public boolean qualify(double quantity) {
		return true;
	}
}
