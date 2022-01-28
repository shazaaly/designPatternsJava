
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza = new ThincrustPizza();
		Pizza CheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(CheesePizza);
		
		System.out.println(" greekPizza " + greekPizza.getDesc() + greekPizza.cost() + " "+ " $");

	}

}
