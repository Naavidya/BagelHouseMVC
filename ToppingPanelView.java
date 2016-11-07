import javax.swing.*;
import java.awt.*;

/**
 * The ToppingPanel class allows the user to select the toppings for the bagel.
 */

public class ToppingPanelView extends JPanel {

	private JCheckBox creamCheese; // To select cream cheese
	private JCheckBox butter; // To select butter
	private JCheckBox peachJelly; // To select peach jelly
	private JCheckBox blueberryJam; // To select blueberry jam

	private Controller control;

	/**
	 * Constructor
	 */

	public ToppingPanelView() {
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

		creamCheese.addActionListener(control.topping);
		butter.addActionListener(control.topping);
		peachJelly.addActionListener(control.topping);
		blueberryJam.addActionListener(control.topping);

	}
}
