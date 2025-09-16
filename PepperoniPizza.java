import javax.swing.*;
// pepperoni class same as 3 types
class PepperoniPizza extends Pizza {
    public PepperoniPizza(String size, String toppings) {
        super(size, toppings);
    }

    @Override
    public void prepPizza() {
        JOptionPane.showMessageDialog(null, "Prepping Pepperoni Pizza with toppings: " + toppings);
    }

    @Override
    public void bakePizza() {
        JOptionPane.showMessageDialog(null, "Baking Pepperoni Pizza");

    }

    @Override
    public void cutPizza() {
        JOptionPane.showMessageDialog(null, "Cutting Pepperoni Pizza");
    }

    @Override
    public void boxPizza() {
        JOptionPane.showMessageDialog(null, "Boxing Pepperoni Pizza");
    }


}