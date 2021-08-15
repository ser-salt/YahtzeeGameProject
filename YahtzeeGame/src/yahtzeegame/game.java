Game.java

package core;

importjava.util.ArrayList;

importjava.util.Scanner;

public class Game

{

     //Add member variables:

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

     public void setInput(Scanner datat)

     {

          this.data = data;

     }

    

     //the no-argument constructor Game

     public Game()

     {

          players= new ArrayList<Player>();

         

          //Prompt the user for number of players

          System.out.print("Enter number of Players: ");

          //Read in data entered by user

          int n = input.nextInt();

          //Loop through number of players and call method newPlayer()

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

          //add the instance of Player to the players member variable

          players.add(p);

     }

     public void showPlayers()

     {

          System.out.println(" The Players are:");

          //loop through the member variable players and

          //display to the console the result of calling method getName()

          for (Player p : players)

          {

              System.out.println(p.getName());

          }

     }    

     public void playGame()

     {

          //loop through the member variable players and call method rollDice()

          for (Player p : players)

          {

              p.rollDice();

          }

     }

}
