package items;


public abstract class PriceByWeightItem implements Item{

	public double getPrice(double weight) {
		return price() * weight;  
	}
	
	protected abstract double price();
}
