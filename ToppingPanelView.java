import javax.swing.*;
import java.awt.*;

/**
   The ToppingPanel class allows the user to select
   the toppings for the bagel.
*/

public class ToppingPanelView extends JPanel
{
   

   private JCheckBox creamCheese;  // To select cream cheese
   private JCheckBox butter;       // To select butter
   private JCheckBox peachJelly;   // To select peach jelly
   private JCheckBox blueberryJam; // To select blueberry jam

   private Controller control;
 
   /**
      Constructor
   */

   public ToppingPanelView()
   {
	  control = new Controller();
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(4, 1));

      // Create the check boxes.
      creamCheese = new JCheckBox("Cream cheese");
      creamCheese.setActionCommand("Cream Cheese");
      butter = new JCheckBox("Butter");
      butter.setActionCommand("Butter");
      peachJelly = new JCheckBox("Peach jelly");
      peachJelly.setActionCommand("Peach Jelly");
      blueberryJam = new JCheckBox("Blueberry jam");
      blueberryJam.setActionCommand("Blueberry Jam");

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Toppings"));

      // Add the check boxes to the panel.
      add(creamCheese);
      add(butter);
      add(peachJelly);
      add(blueberryJam);
      
      creamCheese.addActionListener(control.TPL);
      butter.addActionListener(control.TPL);
      peachJelly.addActionListener(control.TPL);
      blueberryJam.addActionListener(control.TPL);

   }
   
   
  
   public boolean[] getToppingType()
   {
	   boolean[] topping = new boolean[4];
	   for(int i=0; i < topping.length; i++ )
		   topping[i]=false;
	   
	   if(creamCheese.isSelected())
		   topping[0]=true;
	   if(butter.isSelected())
		   topping[1]=true;
	   if(peachJelly.isSelected())
		   topping[2]=true;
	    if(blueberryJam.isSelected())
	       topping[3]=true;
		                     
	    return topping;
		                	   
		            
   }
}
