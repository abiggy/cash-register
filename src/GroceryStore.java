import promo.TenPercentOffPromo;
import promo.ThreeForTwoPromo;
import promo.TwoForOnePromo;
import items.Apple;
import items.Cheerios;
import items.CustomPerItem;
import items.Item;


public class GroceryStore {

	private static CashRegister _register;
	
	public static void main(String[] args) {
		System.out.println("hi!");
		
		init();
	}
	
	private static void init() {
		_register 	= new CashRegister();

		//_register.scanItem(null);
		
		createInventory();
		
	}
	
	private static void createInventory() {
		Item apple 			= Apple.getInstance();
		Item cereal 		= Cheerios.getInstance();
		Item cereal2		= new TenPercentOffPromo(cereal);
		Item cereal3		= new TwoForOnePromo(cereal);
		
		Item specialK 		= new CustomPerItem("Special K", 11, 3.99);
		Item specialKDeal 	= new ThreeForTwoPromo(specialK);
		
	/*	System.out.println(apple.getName() +" "+ apple.getPrice(1.2));
		System.out.println(cereal.getName() +" "+ cereal.getPrice(2));
		System.out.println(cereal2.getName() +" "+ cereal2.getPrice(2));
		System.out.println(cereal3.getName() +" "+ cereal3.getPrice(2));
		System.out.println(cereal3.getName() +" "+ cereal3.getPrice(4));
		System.out.println(cereal3.getName() +" "+ cereal3.getPrice(3));
		System.out.println(specialK.getName() +" "+ specialK.getPrice(3));
		System.out.println(specialKDeal.getName() +" "+ specialKDeal.getPrice(3));
		System.out.println(specialKDeal.getName() +" "+ specialKDeal.getPrice(4));
		*/
		
		
		Cart cart  			= new Cart();
		System.out.println(apple.getName() +" "+ apple.getPrice(1.2));
		cart.addItem(apple, 1.2);
		System.out.println(specialKDeal.getName() +" "+ specialKDeal.getPrice(2));
		cart.addItem(specialK, 2);
		
		for(CartItem item : cart) {
			_register.scanItem(item);
		}
		
		System.out.println("Total: "+_register.getTotal());
		
		System.out.println("Change: " + _register.pay(10.00));

		

		
		

	}

}
