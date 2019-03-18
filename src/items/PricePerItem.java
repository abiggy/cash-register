package items;


public abstract class PricePerItem implements Item{

	public double getPrice(double quantity) {
		return price() * quantity;  
	};

	protected abstract double price();
}
