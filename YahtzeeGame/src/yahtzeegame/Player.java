public class Playerrr {


     //Add member variables

     private String playerName;

     private Results points;

     private Roll roll;

     //Create getter/setter for member variables

     public String getplayerName()

     {

          return playerName;

     }

     public void setplayerName(String name)

     {

          this.playerName = playerName;

     }

     public ResultsCard getPoints()

     {

          return points;

     }

     public void setPoints(Results points)

     {

          this.results = points;

     }

     public Roll getRoll()

     {

          return roll;

     }

     public void setRoll(Roll roll)

     {

          this.roll = roll;

     }

     //no-argument constructor

     public Player()

     {

          //Instantiate an instance of the declared member variable roll

          roll = new Roll();

     }

     public void rollDice()

     {

          //call method rollDice() of member variable roll

          roll.rollDice();

     }

}
    

