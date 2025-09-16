
import javax.swing.JOptionPane;

// Abstract pizza class
abstract class Pizza {
    // initialization
    protected String size;
    protected String toppings;

    // constructor, string inputs
    public Pizza(String size, String toppings) {
        this.size = size;
        this.toppings = toppings;

    }

    //setter and getter methods
    public void setPizzaSize(String size) {
        this.size = size;
    }

    public void setPizzaToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getPizzaSize() {
        return size;
    }

    public String getPizzaToppings() {
        return toppings;
    }

    // abstract method from superclass
    public abstract void prepPizza();
    public abstract void bakePizza();
    public abstract void cutPizza();
    public abstract void boxPizza();
}








