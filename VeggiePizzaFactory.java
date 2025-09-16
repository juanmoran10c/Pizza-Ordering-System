class VeggiePizzaFactory extends PizzaFactory {
    // super orders
    public VeggiePizzaFactory(int orders) {
        super(orders);
    }
    @Override
    // iterate through
    public void createPizza(int orders) {
        for(int i = 0; i < orders; i++) {
            VeggiePizza pizza = new VeggiePizza("Veggie", "Small");
            pizza.prepPizza();
            pizza.bakePizza();
            pizza.cutPizza();
            pizza.boxPizza();
        }
    }
}