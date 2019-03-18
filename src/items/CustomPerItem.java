package items;

public class CustomPerItem extends PricePerItem {
	
	private String _name;
	private int _id;
	private double _price;

	public CustomPerItem(String name, int id, double price) {
		_name 	= name;
		_id 	= id;
		_price 	= price;
	}

	@Override
	public int uniqueID() {
		// TODO Auto-generated method stub
		return _id;
	}

	protected double price() {
		return _price;
	}

	public String getName() {
		return _name;
	}

}
