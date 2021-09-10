
/*

BEADGAME:
The BeadGame class takes 4 parameters.

The first is the total number of beads.
The second is the max number of beads that can be taked per round
The third is player1. Must be derived from the Player class. This player goes first
The fourth is player2. Must be derived from the Player class. This player goes second. 

PLAYER:
different types of players:

Player(String name) -> picks random values each move
ComputerAI(String name) -> uses strategy to pick the best move
RealPerson(String name) -> prompts user for move each time

Any of these can be set as a player

e.g. RealPerson vs RealPerson allows two people to play against one another

e.g. RealPerson vs ComputerAI is a person vs computer
*/

class Main {
  public static void main(String[] args) {
    
    //Smart computer vs smart computer
    ComputerAI c1 = new ComputerAI("AI-1");
    ComputerAI c2 = new ComputerAI("AI-2");

    System.out.println("\nGame Between Two Smart Java Programs:\n");
    BeadGame game1 = new BeadGame(15, 3, c1, c2);
    game1.play();

    System.out.println("\nGame Between A Smart and Dumb Java Program:\n");
    //dumb computer vs smart computer
    Player p1 = new Player("i_pick_random_vals");
    ComputerAI p3 = new ComputerAI("i_am_smart_java_program");

    BeadGame game2 = new BeadGame(15, 3, p1, p3);
    game2.play();
    
    //RealPerson vs computer
    System.out.println("\nGame Between A Real Person and a Smart Java Program:\n");

    RealPerson rp1 = new RealPerson("You");
    ComputerAI p4 = new ComputerAI("i_am_smart_java_program");

    BeadGame game3 = new BeadGame(15, 3, rp1, p4);
    game3.play();
  
  }

}