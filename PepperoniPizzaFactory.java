class PepperoniPizzaFactory extends PizzaFactory {
    // super values
    public PepperoniPizzaFactory(int orders) {
        super(orders);
    }
    @Override
    public void createPizza(int orders) {
        // iterate orders for pizza object creation
        for(int i = 0; i < orders; i++) {
            PepperoniPizza pizza = new PepperoniPizza("Pepperoni", "Large");
            pizza.prepPizza();
            pizza.bakePizza();
            pizza.cutPizza();
            pizza.boxPizza();
        }
    }
}