Roll.java

package core;

importjava.util.ArrayList;

public class Roll

{

     //Add member variables

     private ArrayList<Die> dice;

     //Create getter/setter for member variables

     public ArrayList<Die> getDice()

     {

          return dice;

     }

     public void setDice(ArrayList<Die> dice)

     {

          this.dice = dice;

     }

     //no-argument constructor

     public Roll()

     {

          initializeDice();

     }

     public void startDice()

     {

          dice = new ArrayList<Die> ();

          //loop five times to

          //instantiate and instance of class Die

          for(int i=0;i<5;i++)

          {

              Die d = new Die();

              //add the instance of Die to member variable dice

              dice.add(d);

          }

     }

     public void rollDice()

     {

          //loop through the member variable players and call method rollDice()

          for (Die d : dice)

          {

              //call method rollDie() in class Die

              d.rollDie();

              d.toString();

          }

     }

}
