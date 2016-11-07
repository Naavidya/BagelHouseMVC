
import javax.swing.*;
import java.awt.*;

/**
   The CoffeePanel class allows the user to select coffee.
*/

public class CoffeePanelView extends JPanel
{
   // The following constants are used to indicate
   // the cost of coffee.
  

   private JRadioButton noCoffee;      // To select no coffee
   private JRadioButton regularCoffee; // To select regular coffee
   private JRadioButton decafCoffee;   // To select decaf
   private JRadioButton cappuccino;    // To select cappuccino
   private ButtonGroup bg;             // Radio button group

   private Controller control;
   /**
      Constructor
   */

   public CoffeePanelView()
   {
	  control = new Controller();
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(4, 1));

      // Create the radio buttons.
      noCoffee = new JRadioButton("None");
      noCoffee.setActionCommand("No Coffee");
      regularCoffee = new JRadioButton("Regular coffee", true);
      regularCoffee.setActionCommand("Regular Coffee");
      decafCoffee = new JRadioButton("Decaf coffee");
      decafCoffee.setActionCommand("Decaf Coffee");
      cappuccino = new JRadioButton("Cappuccino");
      cappuccino.setActionCommand("Cappuccino");

      // Group the radio buttons.
      bg = new ButtonGroup();
      bg.add(noCoffee);
      bg.add(regularCoffee);
      bg.add(decafCoffee);
      bg.add(cappuccino);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Coffee"));

      // Add the radio buttons to the panel.
      add(noCoffee);
      add(regularCoffee);
      add(decafCoffee);
      add(cappuccino);
      
      // Add Listeners
      noCoffee.addActionListener(control.CPL);
      regularCoffee.addActionListener(control.CPL);
      decafCoffee.addActionListener(control.CPL);
      cappuccino.addActionListener(control.CPL);
   }

  
}

