/**
 * @(#)RetailPriceCalculator.java
 *
 * RetailPriceCalculator application
 *
 * @author 
 * @version 1.00 2017/4/6
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class RetailPriceCalculator extends JFrame{

private JLabel jlblCost;
private JTextField jtfCost;
private JLabel jlblPercentage;
private JTextField jtfPercentage;
private JButton jbtnPrice;
private JPanel jpnlCalculator;
private final int MAX_WIDTH = 320;
private final int MAX_HEIGHT = 150;

public RetailPriceCalculator()
  
{
setTitle("Retail Price Calculator");
  
  
setSize(MAX_WIDTH,MAX_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
buildCalculatorPanel();
jpnlCalculator.setBackground(Color.GREEN);
  
add(jpnlCalculator);
setVisible(true);
}
private void buildCalculatorPanel()
{
jlblCost= new JLabel("Enter wholesale price of item:");
jtfCost= new JTextField(10);
  
jlblPercentage = new JLabel("Enter the markup percentage of the item:");
  
jtfPercentage = new JTextField(10);
  
jbtnPrice = new JButton("Retail Price");
jpnlCalculator = new JPanel();
  
jbtnPrice.addActionListener(new ListenerToCalculateRetailPrice());
jpnlCalculator.add(jlblCost);
jpnlCalculator.add(jtfCost);
jpnlCalculator.add(jlblPercentage);
jpnlCalculator.add(jtfPercentage);
jpnlCalculator.add(jbtnPrice);
}

private class ListenerToCalculateRetailPrice implements ActionListener{
  
public void actionPerformed(ActionEvent e){

String costStr;

String percentageStr;

double cost;
double percentage;
double retailPrice;

costStr = jtfCost.getText();
cost = Double.parseDouble(costStr);

percentageStr = jtfPercentage.getText();
percentage = Double.parseDouble(percentageStr);

retailPrice = cost + (cost * percentage/100);

JOptionPane.showMessageDialog(null, "The retail price of item: $" + retailPrice);
}}
  
public static void main (String[] args)
{
new RetailPriceCalculator();
}}

 