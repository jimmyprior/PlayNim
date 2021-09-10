

public class BeadGame
{
  private int numBeads;
  private int maxBeads;
  private Player player1;
  private Player player2;


  public BeadGame(int nb, int mb, Player p1, Player p2)
  {
    /*
    np:  the number of total beads
    mb:  the maimum number of beads per hand
    p1:  must be Player class or child of player class. This contrains the logic for the player
    p2: same as above

    */
    numBeads = nb;
    maxBeads = mb;
    player1 = p1;
    player2 = p2;
  }

  public void move(int beads)
  {
    //subtracts (beads) from the total number
    numBeads -= beads;
  }
  
  public boolean isOver()
  {
    //checks to see if the game has ended
    return (numBeads <= 0);
  }


  public void printStats()
  {
    //prints the number of beads remaining
    System.out.println("There are " + numBeads + " beads left");
  }

  public void play()
  {
    //contains the logic for playing a game
    System.out.println("");
    printStats();
    //all Player objects and children contain a getMove method which contains the logic for determining a move... ReadPerson asks for input, ComputerAI attempts to win Player will pick a random value
    int mv1 = player1.getMove(numBeads, maxBeads); //returns the number of beads to take
    move(mv1); //subtracts the number of beans from total
    player1.printMove(mv1);
    //checks to see if the game is over
    if (isOver())
    {
      player1.onWin();
      return;
    }
    printStats();
    //now does the same thing but for player two
    int mv2 = player2.getMove(numBeads, maxBeads);
    move(mv2);
    player2.printMove(mv2);
    if (isOver())
    {
      player2.onWin();
      return;
    }
    //recursive method... calls itself again and keeps doing that until the number of beans is 0.
    play();
  }
}