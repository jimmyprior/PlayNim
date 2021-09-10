public class Player
{
  public String name;
  
  public Player(String n)
  {
    /*
    Base class for a player. 
    To play the bead game, a player must have a getMove method with the parameter numBeads and maxBeads
    it must also have an on win method and a printmove method.

    The getMove for player defaults to picking random values
    */
    name = n;
  } 

  public void printMove(int beads)
  {
    System.out.println(name + " took " + beads + " beans!");
  }

  public int getMove(int numBeads, int maxBeads)
  {
    return (int) (Math.random() * maxBeads) + 1;
  }

  public void onWin()
  {
    System.out.println(name + ": Wow, I pick random values but you still lost!");
  }

}