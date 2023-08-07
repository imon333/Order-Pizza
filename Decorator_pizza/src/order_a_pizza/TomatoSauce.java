package order_a_pizza;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", TomatoSouce" ;
		
	}
	
	public double getCost() {
		return tempPizza.getCost()+.50;
	}

}
