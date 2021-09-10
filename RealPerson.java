import java.util.Scanner;


public class RealPerson extends Player
{
  public RealPerson(String name)
  {
    /*
    This is a real person. 
    The getMove method of Player is overridden and this new getMove method asks the user to input their move. 
    There are some simple checks to make sure that the move in within the necessary range etc. 

    getMove method uses the scanner class to get input. 

    */
    super(name);
  } 

  public void prompt()
  {
    //special method original to child class. Prompts the user  to enter a number of beads
    System.out.print("Enter a number of beads to take: ");
  }

  public int getMove(int numBeads, int maxBeads)
  {
    prompt();
    Scanner kbdIn = new Scanner(System.in);
    int input = kbdIn.nextInt();
    if (!(input > 0 && input <= maxBeads))
    {
      System.out.println("Please pick a value between 0 and " + maxBeads);
      return getMove(numBeads, maxBeads);
    }
    return input;
  }

  public void onWin()
  {
    System.out.println(super.name + " won the game!");
  }

}