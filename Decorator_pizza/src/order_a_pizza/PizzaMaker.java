package order_a_pizza;

import java.security.PublicKey;

public class PizzaMaker {
	
	public static void main(String[] args) {
		Pizza basiPizza = new Mozzarella (new TomatoSauce(new BBQSauce(new PlainPizza())));
		
		System.out.println("Ingredients:" + basiPizza.getDescription());
		System.out.println("Price:" + basiPizza.getCost());
		
	}

}
