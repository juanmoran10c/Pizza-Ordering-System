// this class is the superclass for factory production
abstract class PizzaFactory {
    // initialize encapsulated orders
    protected int orders;

    //int type parameters
    public PizzaFactory(int order) {
        this.orders = order;
    }
    //create pizza for x amount of orders
    public abstract void createPizza(int orders);

}
