class CustomizablePizzaFactory extends PizzaFactory {
    // super orders from factory
    public CustomizablePizzaFactory(int orders) {
        super(orders);
    }
    @Override
    public void createPizza(int orders) {
        // iterate orders for pizza object creation
        for(int i = 0; i < orders; i++) {
            CustomizablePizza pizza = new CustomizablePizza("Cheese", "Medium");
            pizza.prepPizza();
            pizza.bakePizza();
            pizza.cutPizza();
            pizza.boxPizza();
        }

    }
}