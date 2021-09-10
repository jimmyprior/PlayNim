

public class ComputerAI extends Player
{
  public ComputerAI()
  {
    /*
    This AI will attempt to win when it plays 
    it attempts to make the total number of beads divisible by  maxBeads + 1. If that is not possible, it just picks one bead.   
    */
    super("Computer");
  } 

  public ComputerAI(String name)
  {
    super(name);
  } 

  public int getMove(int numBeads, int maxBeads)
  {
    if (numBeads % (maxBeads + 1) ==0)
    {
      return 1;
    }
    else
    {
      return numBeads % (maxBeads + 1);
    }    
  }

  public void onWin()
  {
    System.out.println(super.name + ": Wow, you are bad and lost to Java program!");
  }

}