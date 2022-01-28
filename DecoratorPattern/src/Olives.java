
public class Olives extends ToppingDecorator {
	Pizza pizza;

	public Olives(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.desc + " , Olives";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 6.5;  //olives cost;
	}

}
