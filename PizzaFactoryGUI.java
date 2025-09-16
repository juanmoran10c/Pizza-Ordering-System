import javax.swing.*;

public class PizzaFactoryGUI {
    // add counter for number of orders made
    private static int ticketCounter = 1;

    // begin pizza factory with JOption functions
    public static void main(String[] args) {
        // loop for orders of user input
        boolean ordering = true;
        while (ordering) {
            // let users choose from a selection of string values
            String[] pizzaOptions = {"Veggie", "Pepperoni", "Custom"};
            int pizzaChoice = JOptionPane.showOptionDialog(null,
                    "Select Type of Pizza:",
                    "Pizza Factory",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    pizzaOptions,
                    pizzaOptions[0]
            );
            // user closes window
            if (pizzaChoice == -1) {
                break;
            }
            // repeat user input for size
            String[] sizes = {"Small", "Medium", "Large"};
            String size = (String) JOptionPane.showInputDialog(null,
                    "Select the Pizza Size",
                    "Pizza Size",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    sizes,
                    sizes[0]);
            if (size == null) break;

            //allow users to choose pizza
            String toppings = pizzaOptions[pizzaChoice];
            if (pizzaOptions[pizzaChoice].equals("Custom")) {
                toppings = JOptionPane.showInputDialog("Enter toppings of your choice!!!!");
                if (toppings == null) break; // break if user declines
            }

            int orders;
            // create # of pizzas
            // error input handling for type
            try{
                String orderInput = JOptionPane.showInputDialog("Enter the Amount of Pizza you would like to order");
                if (toppings == null) break;
                orders = Integer.parseInt(orderInput); // type cast input
            } catch (NumberFormatException e) { // handle user mistypes
                JOptionPane.showMessageDialog(null, "Please enter a valid number amount");
                continue;
            }

            //create factory object for type chosen with inherited variables
            PizzaFactory factory;
            switch (pizzaOptions[pizzaChoice]) {
                case "Veggie":
                    factory = new VeggiePizzaFactory(orders);
                    break;
                case "Pepperoni":
                    factory = new PepperoniPizzaFactory(orders);
                    break;
                default:
                    factory = new CustomizablePizzaFactory(orders);
                    break;
            }
            // create num of orders by for loop
            for (int i = 0; i < orders; i++) {
                Pizza pizza;
                switch (pizzaOptions[pizzaChoice]) {
                    case "Veggie":
                        pizza = new VeggiePizza(toppings, size);
                        break;
                    case "Pepperoni":
                        pizza = new PepperoniPizza(toppings, size);
                        break;
                    default:
                        pizza = new CustomizablePizza(toppings, size);
                        break;
                }

                pizza.prepPizza();
                pizza.bakePizza();
                pizza.cutPizza();
                pizza.boxPizza();

                JOptionPane.showMessageDialog(null, "Order complete! Ticket: #" + ticketCounter++);
            }

            // include end or continue option for user
            int more = JOptionPane.showConfirmDialog(
                    null,
                    "Would you like to order more pizzas?",
                    "Feeling Hungry?",
                    JOptionPane.YES_NO_OPTION);
            if (more != JOptionPane.YES_OPTION) {
                ordering = false; // close
            }


        }
    }
}
