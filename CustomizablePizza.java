import javax.swing.*;
// customizable user pizza, options in gui
class CustomizablePizza extends Pizza {
    public CustomizablePizza(String size, String toppings) {
        super(size, toppings);
    }

    @Override
    public void prepPizza() {
        JOptionPane.showMessageDialog(null, "Prepping Custom Pizza: " + toppings);
    }

    @Override
    public void bakePizza() {
        JOptionPane.showMessageDialog(null, "Baking Custom Pizza");

    }

    @Override
    public void cutPizza() {
        JOptionPane.showMessageDialog(null, "Cutting Custom Pizza");
    }

    @Override
    public void boxPizza() {
        JOptionPane.showMessageDialog(null, "Boxing Custom Pizza");
    }
}