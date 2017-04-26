/**
 * @(#)JoesAutomotive.java
 *
 * JoesAutomotive application
 *
 * @author 
 * @version 1.00 2017/4/6
 */
 import javax.swing.*;
 import java.awt.event.*;
 
public class JoesAutomotive extends JFrame {
    
    private JPanel panel;
    private JCheckBox oilCB, lubeCB, radiatorCB, transmissionCB, inspectionCB, mufflerCB, tireCB, othersCB;

private JLabel laborCharges, numOfHours;
private JButton totalAmount;
private JTextField hours;

private final double OIL = 26.00;
private final double LUBE = 18.00;
private final double RADIATOR = 30.00;
private final double TRANSMISSION = 80.00;
private final double INSPECTION = 15.00;
private final double MUFFLER = 100.00;
private final double TIRE = 20.00;
private final double LABOR_PER_HOUR = 20.00;
private final double OTHERS = 50.00;
private final int WINDOW_WIDTH = 210;
private final int WINDOW_HEIGHT = 400;


// constuctor
public JoesAutomotive()
{
	// set the title bar
	setTitle("Joe's Automotive Shop");
	
	//set the size of the window
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	buildPanel();
	add(panel);
	
	setVisible(true);
}


private void buildPanel()
{
	panel = new JPanel();
	
	//create the checkboxes
	oilCB = new JCheckBox("Oil Change: $" + OIL);
	lubeCB = new JCheckBox("Lube job: $" + LUBE);
	radiatorCB = new JCheckBox("Radiator flush: $" + RADIATOR);
	transmissionCB = new JCheckBox("Transmission Flush: $" + TRANSMISSION);
	inspectionCB = new JCheckBox("Inspection:  $"+ INSPECTION);
	mufflerCB = new JCheckBox("Muffler replacement: $" + MUFFLER);
	tireCB = new JCheckBox("Tire rotation: $" + TIRE);
	othersCB = new JCheckBox("Other Changes: $ " + OTHERS);
	
	
	laborCharges = new JLabel("Labor Charges : $" + LABOR_PER_HOUR + " per hour.");
	numOfHours= new JLabel("Enter the number of hours:" );
	
	hours = new JTextField(3);
	
	//create butotn for total amount
	totalAmount = new JButton("Total");
	
	totalAmount.addActionListener(new CalcButtonListener());
	
	panel.add(oilCB);
	panel.add(lubeCB);
	panel.add(radiatorCB);
	panel.add(transmissionCB);
	panel.add(inspectionCB);
	panel.add(mufflerCB);
	panel.add(tireCB);
	panel.add(othersCB);
	panel.add(laborCharges);
	panel.add(numOfHours);
	panel.add(hours);
	panel.add(totalAmount);
}

private class CalcButtonListener implements  ActionListener{
	public void actionPerformed(ActionEvent e){
		
		
		double amount = 0.00;
		
		if (oilCB.isSelected())
			amount += OIL;
			if(lubeCB.isSelected())
				amount += LUBE;
				if(radiatorCB.isSelected())
					amount += RADIATOR;
					if(transmissionCB.isSelected())
						amount += TRANSMISSION;
						if(inspectionCB.isSelected())
							amount += INSPECTION;
							if(mufflerCB.isSelected())
								amount += MUFFLER;
								if (tireCB.isSelected())
									amount += TIRE;
									if(othersCB.isSelected())
										amount += OTHERS;
										
		String input = hours.getText();
		int hrs = Integer.parseInt(input);
		
		amount += LABOR_PER_HOUR * hrs;
		
		JOptionPane.showMessageDialog(null, "You have to pay the amount of $" + amount);
	}}
	
	public static void main(String[]args)
	{
		JoesAutomotive j = new JoesAutomotive();
	}}			
		
		
	