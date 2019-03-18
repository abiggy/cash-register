package items;

public class Cheerios extends PricePerItem {
	
	private String _name 	= "Cheerios";
	private int _id 		= 1234;
	private double _price 	= 6.99;

	static protected Cheerios _singleton = null;

	private Cheerios() {
		
	}

	public static Cheerios getInstance() {
		if (_singleton == null) {
			_singleton = new Cheerios();
		}
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
