import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in); //Initialize the scanner and print a welcome to game message
         while (true) { //Use a while(true) loop and only break the loop if user wants to quit the game.
             System.out.println("Welcome to Rock, Paper, Scissors!"); //Welcome player to game
             System.out.println("Choose rock, paper, or scissors. 'r' for rock, 'p' for paper, and 's' for scissors. To quit the game, enter 'quit'."); //Putting this text will get the user's move through user input.
             String mymove = in.nextLine();
             if (mymove.equals("quit")) {
                 break;
             }
             if (!mymove.equals("r") && !mymove.equals("p") && !mymove.equals("s")) { //Check if user's move is valid (r, p, s, or quit) are only valid answers.
                 System.out.println("Your move isn't valid");
             } else {
                 int random = (int) (Math.random() * 3); //Get a random number in between 0 and 3 and then convert it into an integer so that possible numbers are 0, 1, or 2.
                 String opponentmove = ""; //Convert the random number to a string using conditionals and print the opponent's move.
                 if (random == 0) {
                     opponentmove = "r";
                 } else if (random == 1) {
                     opponentmove = "p";
                 } else {
                     opponentmove = "s";
                 }
                 System.out.println("Opponent move: " + opponentmove); //Will print out the opponent's move (r, p, or s) with the statement "Opponent move:" in front.
                 if (mymove.equals(opponentmove)) { //Prints that the result of game is a tie when opponent move and my move are the same.
                     System.out.println("tie");
                 } else if ((mymove.equals("r") && opponentmove.equals("s")) ||
                         (mymove.equals("s") && opponentmove.equals("p")) ||
                         (mymove.equals("p") && opponentmove.equals("r"))) {
                     System.out.println("You win"); //Prints out the statement "You win" when the three lines above happen during the game.
                 } else {
                     System.out.println("You lost"); //Prints out the statement "You lost" when the opposite of the three lines above happens during the game.
                 }

             }
             System.out.println("Thanks for playing Rock, Paper, Scissors!"); //Thank user for playing after every move
}
}}