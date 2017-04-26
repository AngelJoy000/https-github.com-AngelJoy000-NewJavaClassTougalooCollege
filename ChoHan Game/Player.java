import java.util.Random;

/**
 *  Player class for the game of Cho-Han
 */
   

public class Player {
   private String name; // The player's name
   private String guess; // The player's guess
   private int points; // The player's points
   private int guessNumber; // The player's guessNumber

   /**
   * Constructor Accepts the player's name as an argument
   */
   public Player(String playerName) {
       name = playerName;
       guess = "";
       points = 0;
   }

   /**
   * The makeGuess method causes the player to guess either "Cho (even)" or
   * "Han (odd)".
   */
   private void makeGuess(int guessNumber) {
       if (guessNumber % 2 == 0)
           guess = "Cho (even)";
       else
           guess = "Han (odd)";
   }
  
   /**
   * The makePlayerGuess method causes the player to guess between 2 to 12
   */
   public void makePlayerGuess(int guessNumber) {
       //Set player guess either "Cho (even)" or "Han (odd)"
       makeGuess(guessNumber);
       this.guessNumber=guessNumber;
   }

   /**
   * The addPoints method adds a specified number of points to the player's
   * current balance. The number of points is passed as an argument.
   */
   public void addPoints(int newPoints) {
       points += newPoints;
   }

   /**
   * The getName method returns the player's name.
   */
   public String getName() {
       return name;
   }

   /**
   * The getGuess method returns the player's guess.
   */
   public String getGuess() {
       return guess;
   }

   /**
   * The getPoints method returns the player's points
   */
   public int getPoints() {
       return points;
   }

   /**
   * @return the guessNumber
   */
   public int getGuessNumber() {
       return guessNumber;
   }
  
}

