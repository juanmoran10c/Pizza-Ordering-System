//veggie pizza class that is the subclass with superclass constructor

import javax.swing.*;

class VeggiePizza extends Pizza {
    public VeggiePizza(String size, String toppings) {super(size,toppings);}
    @Override
    public void prepPizza() {
        JOptionPane.showMessageDialog(null, "Prepping Veggie Pizza with toppings: " + toppings);
    }
    @Override
    public void bakePizza() {
        JOptionPane.showMessageDialog(null, "Baking Veggie Pizza");

    }
    @Override
    public void cutPizza() {
        JOptionPane.showMessageDialog(null, "Cutting Veggie Pizza");
    }
    @Override
    public void boxPizza() {
        JOptionPane.showMessageDialog(null, "Boxing Veggie Pizza");
    }
}

