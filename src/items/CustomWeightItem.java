package items;

public class CustomWeightItem extends PriceByWeightItem {
	
	private String _name 	= "Cheerios";
	private int _id 		= 1234;
	private double _price 	= 6.99;

	static protected CustomWeightItem _singleton = null;

	private CustomWeightItem(String name, int id, double price) {
		_name 	= name;
		_id 	= id;
		_price 	= price;
	}
	
	public static void init(String name, int id, double price) {
		_singleton  	= new CustomWeightItem(name, id, price);
	}

	public static CustomWeightItem getInstance() {
		return _singleton;
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
