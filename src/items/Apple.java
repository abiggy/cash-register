package items;

public class Apple extends PriceByWeightItem {
	
	private String _name 	= "Apple";
	private int _id	 		= 10;
	private double _price 	= 1.2; // per kg
	
	static protected Apple _singleton = null;

	private Apple() {
		
	}

	public static Apple getInstance() {
		if (_singleton == null) {
			_singleton = new Apple();
		}
		return _singleton;
	}
	

	@Override
	public int uniqueID() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	@Override
	protected double price() {
		return _price;
	}
	
	

}
