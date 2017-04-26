/**
 * @(#)ShadesDesigner.java
 *
 * ShadesDesigner application
 *
 * @author 
 * @version 1.00 2017/4/18
 */
 
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ShadesDesigner extends JFrame
{
private String[] styles123 = {"Regular Shadesval", "Folding Shadesval", "Roman Shadesval"};
private String[] size123 = {"25 Inches Wide value", "27 Inches Wide value",
"32 Inches Wide value", "40 Inches Wide value"};
private String[] colors123 = {"Natural_Color123", "Blue_Color123", "Teal_Color123",
"Red_Color123", "Green_Color123"};
private JLabel banner123;
private JPanel banner123Panel;
private JPanel stylesPanel123;
private JPanel sizePanel23;
private JPanel colorPanel23;
private JPanel buttonPanel23;
private JList stylesList23;
private JList sizeListl23;
private JList colorListl23;
private JTextField Styles;
private JTextField Size;
private JTextField Color;
private JButton calcButton23;
private JButton ExitButton23;
private double totalChargesvalue = 50.00;


//Constants
private final int ROWS = 5;
private final double regularCostvalue = 0.00;
private final double foldingCostvalue = 10.00;
private final double romanCostvalue = 15.00;
private final double twentyfiveInCostvalue = 0.00;
private final double twentySevenInCostvalue = 2.00;
private final double thirtyTwoInCost = 4.00;
private final double fourtyInCostvalue = 6.00;
private final double naturalColorCostvalue = 5.00;


public ShadesDesigner()
{
setTitle("Shades Designer");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
buildbanner123Panel();
add(banner123Panel, BorderLayout.NORTH);
stylesPanel123();
add(stylesPanel123, BorderLayout.WEST);
sizePanel23();
add(sizePanel23, BorderLayout.CENTER);
colorPanel23();
add(colorPanel23, BorderLayout.EAST);
buttonPanel23();
add(buttonPanel23, BorderLayout.SOUTH);
pack();
setVisible(true);
}
private void buildbanner123Panel()
{
banner123Panel = new JPanel();
banner123Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
banner123 = new JLabel("Shade Designer");
banner123.setFont(new Font("SanSerif", Font.BOLD, 24));
banner123Panel.add(banner123);
}
private void stylesPanel123()
{
JLabel styleTitle = new JLabel("Select a Style.");
stylesPanel123 = new JPanel();
stylesPanel123.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
stylesList23 = new JList (styles123);
stylesList23.setVisibleRowCount(ROWS);
JScrollPane stylesScrollPane = new JScrollPane(stylesList23);
stylesList23.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
stylesList23.addListSelectionListener(new stylesList23Listener());
stylesPanel123.setLayout(new BorderLayout());
stylesPanel123.add(styleTitle, BorderLayout.NORTH);
stylesPanel123.add(stylesScrollPane, BorderLayout.CENTER);
Styles = new JTextField (5);
Styles.setEditable(false);
stylesPanel123.add(Styles, BorderLayout.SOUTH);
}
private class stylesList23Listener implements ListSelectionListener
{
public void valueChanged (ListSelectionEvent e)
{
String selection = (String) stylesList23.getSelectedValue();
Styles.setText(selection);
}
}
private void sizePanel23()
{
JLabel sizeTitle = new JLabel("Select a Size.");
sizePanel23 = new JPanel();
sizePanel23.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
sizeListl23 = new JList (size123);
sizeListl23.setVisibleRowCount(ROWS);
JScrollPane stylesScrollPane = new JScrollPane(sizeListl23);
sizeListl23.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
sizeListl23.addListSelectionListener(new sizeListl23Listener());
sizePanel23.setLayout(new BorderLayout());
sizePanel23.add(sizeTitle, BorderLayout.NORTH);
sizePanel23.add(stylesScrollPane, BorderLayout.CENTER);
Size = new JTextField (5);
Size.setEditable(false);
sizePanel23.add(Size, BorderLayout.SOUTH);
}
private class sizeListl23Listener implements ListSelectionListener
{
public void valueChanged (ListSelectionEvent e)
{
String selection = (String) sizeListl23.getSelectedValue();
Size.setText(selection);
}
}
private void colorPanel23()
{
JLabel colorTitle = new JLabel("Select a Color.");
colorPanel23 = new JPanel();
colorPanel23.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
colorListl23 = new JList (colors123);
colorListl23.setVisibleRowCount(ROWS);
JScrollPane colors123crollPane = new JScrollPane(colorListl23);
colorListl23.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
colorListl23.addListSelectionListener(new colorListl23Listener());
colorPanel23.setLayout(new BorderLayout());
colorPanel23.add(colorTitle, BorderLayout.NORTH);
colorPanel23.add(colors123crollPane, BorderLayout.CENTER);
Color = new JTextField (5);
Color.setEditable(false);
colorPanel23.add(Color, BorderLayout.SOUTH);
}
private class colorListl23Listener implements ListSelectionListener
{
public void valueChanged (ListSelectionEvent e)
{
String selection = (String) colorListl23.getSelectedValue();
Color.setText(selection);
}
}
private void buttonPanel23()
{
calcButton23= new JButton ("Calculate Charges");
calcButton23.addActionListener(new calcButton23Listener());
ExitButton23 = new JButton ("Exit");
ExitButton23.addActionListener(new ExitButton23Listener());
buttonPanel23 = new JPanel();
buttonPanel23.add(calcButton23);
buttonPanel23.add(ExitButton23);
}
private class calcButton23Listener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
DecimalFormat dollar123 = new DecimalFormat("#,##0.00");
JOptionPane.showMessageDialog(null, "totalChargesvalue: $" +
dollar123.format(totalChargesvalue));
}
}
private class ExitButton23Listener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
System.exit(0);
}
}
public static void main(String[] args)
{
new ShadesDesigner();
}
}
