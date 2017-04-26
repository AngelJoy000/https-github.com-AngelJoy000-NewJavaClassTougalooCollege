/**
 * @(#)BaseballWithClassesTester.java
 *
 *
 * @author 
 * @version 1.00 2017/3/24
 */


public class BaseballWithClassesTester {

       static double calculateCost(double shoeCost, double shirtPantCost, double hatCost, int noOfPlayers) {
        return (shoeCost + shirtPantCost + hatCost) * noOfPlayers * 1.07;
    }
}