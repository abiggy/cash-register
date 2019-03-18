import items.Item;


public class ProcessedItem {

	private double _quantity;
	private Item _item;

	public ProcessedItem(Item item, double quantity) {
		_item 	= item;
		_quantity 	= quantity;
	}
	public void updateQuantity(Object amount) {
		// TODO Auto-generated method stub
		
	}
	public double getQuantity() {
		// TODO Auto-generated method stub
		return _quantity;
	}
	
	public void setQuantity(double newQuantity) {
		// TODO Auto-generated method stub
		_quantity 	= newQuantity;
	}
	
	public Item getItem() {
		return _item;
	}
	
	


}
