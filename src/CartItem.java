import items.Item;


public class CartItem {
	private Item _item;
	private double _quantity;
	
	public CartItem(Item item, double quantity) {
		_item 		= item;
		_quantity 	= quantity;
	}

	public Item item() {
		// TODO Auto-generated method stub
		return _item;
	}

	public double quantity() {
		return _quantity;
	}

}
