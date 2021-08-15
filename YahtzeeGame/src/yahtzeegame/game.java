Game.java

package Yahtzee;

importjava.util.ArrayList;

importjava.util.Scanner;

public class Game

{


     private int gameLevel;

     private ArrayList<Player> players;

     Scanner input = new Scanner(System.in);

     //Create getter/setter for member variables

     public int getGameLevel()

     {

          returngameLevel;

     }

     public void setGameLevel(intgameLevel)

     {

          this.gameLevel = gameLevel;

     }

     public ArrayList<Player> getPlayer()

     {

          return players;

     }

     public void setPlayer(ArrayList<Player> player)

     {

          this.players = player;

     }

     public Scanner getData()

     {

          return data;

     }

     public void setInput(Scanner data)

     {

          this.data = data;

     }

    


     public Game()

     {

          players= new ArrayList<Player>();

         

          System.out.print("Enter number of Players: ");

          //Read in data entered by user

          int n = input.nextInt();


          for(int i=0;i<n;i++)

          {

              newPlayer();

          }

     }

     public void newPlayer()

     {


          System.out.print("Enter the name of the player: ");

          String name = input.next();

         

          Player p = new Player();

         
          p.setName(name);

          

          players.add(p);

     }

     public void showPlayers()

     {

          System.out.println(" The Players are:");

          

          for (Player p : players)

          {

              System.out.println(p.getName());

          }

     }    

     public void playGame()

     {


          for (Player p : players)

          {

              p.rollDice();

          }

     }

}
