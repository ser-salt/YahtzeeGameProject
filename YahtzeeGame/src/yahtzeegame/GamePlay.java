public class GamePlay {
{
Yahtzee yahtzee = new Yahtzee();
}
}

}
   
   private void setupGame() {
      IODialog dialog = getDialog();
      nPlayers = dialog.readInt("Enter number of players");
      playerNames = new String[nPlayers];
      for (int i = 1; i <= nPlayers; i++) {
         playerNames[i-1] = dialog.readLine("Enter name for player " + i);
      }
      display = new YahtzeeDisplay(getGCanvas(), playerNames);
      
      categoryScores=  new int[nPlayers+1][N_CATEGORIES+1];
      selectedCategories = new int[nPlayers+1][N_CATEGORIES+1];
      diceArray = new int [N_DICE];
   }
 }


  private void firstRollDice(int j) {
     display.printMessage(playerNames[j-1] + "'s turn. Click 'Roll Dice' button to roll the dice.");
     display.waitForPlayerToClickRoll(j);                  
     for (int l=0; l<N_DICE; l++) {              // 5 dice each turn
        int diceRollNumber = rgen.nextInt(1,6);  // 6 numbers per die
        diceArray[l] = diceRollNumber; 
     }
     display.displayDice(diceArray);
  }
  
  }

  
   private void calculateCategoryScore (int category, int playerNumber, int [] diceArray) {
      selectedCategories[playerNumber][category] = 1;
      int cscore = 0;
      
      //Ones through sixes
      // Since each category is "named" after the number it represents,
      // Multiplying the category name by its occurrences in diceArray yields the score
      if (category ==ONES || category ==TWOS || category ==THREES || 
            category ==FOURS || category ==FIVES || category ==SIXES) {
         int count = 0;      
         for (int i = 1; i<=diceArray.length; i++) {
            if (diceArray[i-1] == (category)) {
               count++;
            }
         } 
         cscore = count * category;
      }
      
      if (category== THREE_OF_A_KIND || category == FOUR_OF_A_KIND || category == CHANCE) {
         cscore = sumArray(diceArray);
      }
      
      // Full house, Small Straight, Large Straight, Yahtzee!
      if (category ==  FULL_HOUSE) cscore = 25;
      if (category == SMALL_STRAIGHT) cscore = 30;
      if (category == LARGE_STRAIGHT) cscore = 40;
      if (category == YAHTZEE) cscore = 50;
      
      categoryScores[playerNumber][category] = cscore;
   }
}
private int sumScoreArray(int[] array)
   {
      int sumscore = 0;
      for (int i = 0; i<array.length; i++) {
         sumscore += array[i];
      }
      return sumscore;
   }
   
   public static final int UPPER_RESULT = 7;
   public static final int UPPER_BONUS = 8;
   public static final int LOWER_RESULT = 16;
   public static final int TOTAL = 17;
   
   private void updateResults(int category, int playerNumber)
{      
      // Individual Category Score
      int results = 0;
      results = categoryResults[playerNumber][category];
      display.updateResultcard(category, playerNumber, result());
      
      // Upper Score
      int UpperResult = 0;
      for (int i = 0; i<UPPER_RESULT; i++) {
         UpperResult += categoryResults[playerNumber][i];
         }
      display.updateResultcard(UPPER_Result, playerNumber, UpperResult);

      // Lower Score
      int LowerResult= 0;
      for (int i = 0; i<LOWER_Result; i++) {
         LowerResult += categoryResults[playerNumber][i];
         }
      display.updateResultscard(LOWER_Result, playerNumber, LowerResult);
      
      // Total
      int Totalresult = UPPER_RESULT + LOWER_RESULT;
      display.updateResultscard(TOTAL, playerNumber, Totalresults);
}
