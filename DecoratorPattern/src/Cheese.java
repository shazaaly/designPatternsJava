
public class Cheese extends ToppingDecorator{
	
	Pizza pizza;
	
	public Cheese(Pizza pizza ) {
		this.pizza = pizza;
		
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.desc + " ,Cheese ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+ 0.22;  // cheese cost added
	}
	

}
