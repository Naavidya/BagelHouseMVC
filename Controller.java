import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Controller {
	public BagelListener bagel;
	public CoffeeListener coffee;
	public ToppingListener topping;
	public CalcButtonListener calc;
	public ExitButtonListener exit;

	private calculations bill;

	public Controller() {
		bill = new calculations();

		bagel = new BagelListener();
		coffee = new CoffeeListener();
		topping = new ToppingListener();
		calc = new CalcButtonListener();
		exit = new ExitButtonListener();

	}

	public class BagelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if ((e.getActionCommand()).equals("White Bagel")) {
				bill.setBagel("white");
			} else {
				bill.setBagel("wheat");
			}
		}

	}

	public class CoffeeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int type;
			String coffee = e.getActionCommand();
			if (coffee.equals("No Coffee")) {
				type = 1;
			} else if (coffee.equals("Regular Coffee")) {
				type = 2;
			} else if (coffee.equals("Decaf Coffee")) {
				type = 3;
			} else {
				type = 0;
			}
			bill.setCoffee(type);
		}
	}

	public class ToppingListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JCheckBox checkBox = (JCheckBox) e.getSource();
			String temp = e.getActionCommand();
			boolean[] toppings = bill.getToppings();
			if (temp.equals("Cream Cheese")) {
				toppings[0] = checkBox.isSelected();
			}
			if (temp.equals("Butter")) {
				toppings[1] = checkBox.isSelected();
			}
			if (temp.equals("Peach Jelly")) {
				toppings[2] = checkBox.isSelected();
			}
			if (temp.equals("Blueberry Jam")) {
				toppings[3] = checkBox.isSelected();
			}

			bill.setToppings(toppings);

		}
	}

	public class CalcButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Variables to hold the subtotal, tax, and total
			double subtotal;

			// Calculate the subtotal.
			double bills[] = new double[3];
			bills = bill.gettheBill();
			subtotal = bills[0] + bills[1] + bills[2];

			// Create a DecimalFormat object to format output.
			DecimalFormat dollar = new DecimalFormat("0.00");

			// Display the charges.
			JOptionPane.showMessageDialog(null, "Subtotal: $" + dollar.format(subtotal) + "\n" + "Tax: $"
					+ dollar.format(bills[3]) + "\n" + "Total: $" + dollar.format(bills[4]));

		}
	}

	public class ExitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}