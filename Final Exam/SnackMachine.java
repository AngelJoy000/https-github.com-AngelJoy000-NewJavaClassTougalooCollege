/**
 * @(#)SnackMachine.java
 *
 * SnackMachine Applet application
 *
 * @author Angel Patterson
 *  Date: April 25, 2017 
 *  Final Project
 *
 */
 
import java.awt.*;
import java.applet.*;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

public class SnackMachine extends Applet {
   
   
   
   // Varibel declartion
   private double amount;
   private final double PRICEDRINKS = 1.25;
   private final double PRICECHIPS = 0.65;
   private final double PRICECOOKIES = 0.75;
   private int numClicks = 0;
   private JButton classicLays;
   private JButton bbqChips;
   private JButton cheddarChips;
   private JButton strawberrySoda;
   private JButton grapeSoda;
   private JButton rootBeer;
   private JButton orangeSoda;
   private JButton waterBottle;
   private JButton oreoCookies;
   private JButton lemonCookies;
   private JButton butternutCookies;
   private JButton vanillaWafers;
   double changesReturned, changessReturned, changeReturned;
   public void init() {
       setLayout(new FlowLayout());
       String moneyEntered = JOptionPane
               .showInputDialog("Enter amount of money entered: ");
   amount = Double.parseDouble(moneyEntered);
   changeReturned = amount - 1.25;
       changesReturned = amount - 0.65;
       changessReturned = amount - 0.75;
       makeButtons();
   }
   private void makeButtons() {
       classicLays = new JButton("Classic Lays Chips Button");
       bbqChips = new JButton("BBQ Chips Button");
       cheddarChips = new JButton("Cheddar Chips Button");
       strawberrySoda = new JButton("Strawberry Button");
       rootBeer = new JButton("Root Beer Button");
       grapeSoda = new JButton("Grape Soda Button");
       orangeSoda = new JButton("Orange Soda Button");
       waterBottle = new JButton("Water Bottle Button");
       oreoCookies = new JButton("Oreo Cookies Button");
       lemonCookies = new JButton("Lemon Cookies Button");
       butternutCookies = new JButton("Butternut Button");
       vanillaWafers = new JButton("Vanilla Wafers Button");
       classicLays.addActionListener(new ButtonHandler());
       bbqChips.addActionListener(new ButtonHandler());
       cheddarChips.addActionListener(new ButtonHandler());
       strawberrySoda.addActionListener(new ButtonHandler());
       rootBeer.addActionListener(new ButtonHandler());
       grapeSoda.addActionListener(new ButtonHandler());
       orangeSoda.addActionListener(new ButtonHandler());
       waterBottle.addActionListener(new ButtonHandler());
       oreoCookies.addActionListener(new ButtonHandler());
       lemonCookies.addActionListener(new ButtonHandler());
       butternutCookies.addActionListener(new ButtonHandler());
       vanillaWafers.addActionListener(new ButtonHandler());
       add(classicLays);
       add(bbqChips);
       add(cheddarChips);
       add(strawberrySoda);
       add(rootBeer);
       add(grapeSoda);
       add(orangeSoda);
       add(waterBottle);
       add(oreoCookies);
       add(lemonCookies);
       add(butternutCookies);
       add(vanillaWafers);
   }
   private class ButtonHandler implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           if (amount == 0.0 || amount < 1.25 || amount < 0.65
                   || amount < 0.75) {
               JOptionPane.showMessageDialog(null,
                       "Enter a sufficient amount of money.");
           } else {
               if (e.getSource() == classicLays) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is "
                                               + changesReturned
                                               + " and your selected snack is Classic Lays ");
                   else
                       JOptionPane.showMessageDialog(null, "out of stock ");
               }
               if (e.getSource() == bbqChips) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changesReturned
                                               + " and your selected snack is BBQ Chips ");
                   else
                       JOptionPane.showMessageDialog(null, "out of stock ");
               }
               if (e.getSource() == cheddarChips) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changesReturned
                                               + " and your selected snack is Cheddar Chips");
                   else
                       JOptionPane.showMessageDialog(null, "out of stock ");
               }
               if (e.getSource() == strawberrySoda) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changeReturned
                                               + " and your selected drink is Strawberry Soda");
                   else
                       JOptionPane.showMessageDialog(null, "out of stock ");
               }
               if (e.getSource() == rootBeer) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changeReturned
                                               + " and your selected drink is Rootbeer Soda ");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == grapeSoda) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changeReturned
                                               + " and your selected drink is Grape Soda ");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == orangeSoda) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changeReturned
                                               + " and your selected drink is Orange Soda");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == waterBottle) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane.showMessageDialog(null,
                               "The change due is : " + changeReturned
                                       + " and your selected bottle of water");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == oreoCookies) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changessReturned
                                               + " and your selected snack is Oreo Cookies ");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == lemonCookies) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changessReturned
                                               + " and your selected snack Lemon Cookies ");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == butternutCookies) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane
                               .showMessageDialog(
                                       null,
                                       "The change due is : "
                                               + changessReturned
                                               + " and your selected snack Butternut Cookies ");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
               if (e.getSource() == vanillaWafers) {
                   numClicks++;
                   if (numClicks <= 20)
                       JOptionPane.showMessageDialog(null, "Change Due is : "
                               + changessReturned
                               + " and your selected snack Vanilla Wafers ");
                   else
                       JOptionPane.showMessageDialog(null, "Out of stock ");
               }
           }
       }
   }
}
