import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Controller
{
	public BagelListener BBL;
	public CoffeeListener CPL;
	public ToppingListener TPL;
	public CalcButtonListener CBL;
	public ExitButtonListener EBL;
	
	private calculations bill;
	
	public Controller()
	{
		bill = new calculations();
		
		BBL = new BagelListener();
		CPL = new CoffeeListener();
		TPL = new ToppingListener();
		CBL = new CalcButtonListener();
		EBL = new ExitButtonListener();
		
	}
	public class BagelListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if((e.getActionCommand()).equals("White Bagel"))
			{
				bill.setBagel("White Bagel");
			}
			else
			{
				bill.setBagel("Wheat");
			}
		}
		
	}
	
	public class CoffeeListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int type = -1;
			String coffee = e.getActionCommand();
			if(coffee.equals("No Coffee"))
			{
				type = 1;
			}
			else if(coffee.equals("Regular Coffee"))
			{
				type = 2;
			}
			else if(coffee.equals("Decaf Coffee"))
			{
				type = 3;
			}
			else
			{
				type = 0;
			}
			bill.setCoffee(type);
		}
	}
	
	public class ToppingListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
	
	public class CalcButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// Variables to hold the subtotal, tax, and total
	         double subtotal;

	         bill = new calculations();
	       
	         // Calculate the subtotal.
	         double bills[] = new double[3];
	         bills=bill.gettheBill();
	         subtotal = bills[0] +  bills[1] +  bills[2];

	         
	         // Create a DecimalFormat object to format output.
	         DecimalFormat dollar = new DecimalFormat("0.00");

	         // Display the charges.
	         JOptionPane.showMessageDialog(null, "Subtotal: $" +
	                       dollar.format(subtotal) + "\n" +
	                       "Tax: $" + dollar.format(bills[3]) + "\n" +
	                       "Total: $" + dollar.format(bills[4]));
	         
	                  
		}	
	}
	
	public class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
}