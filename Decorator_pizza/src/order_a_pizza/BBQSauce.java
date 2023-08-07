package order_a_pizza;

public class BBQSauce extends ToppingDecorator {
	public BBQSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", BBQSauce" ;
		
	}
	
	public double getCost() {
		return tempPizza.getCost()+.60;
	}
}
