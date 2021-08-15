/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeegame;

/**
 *
 * @author Brendan
 */
public class ScoreCard {
    private int totalScore;
    private int aces;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
    private int threeOfAKind;
    private int fourOfAKind;
    private int fullHouse;
    private int smallStraight;
    private int largeStraight;
    private int yahtzee;
    private int chance;
    private boolean isComplete;
    private int yahtzeeBonus;
    
    public ScoreCard() {
        totalScore = 0;
        isComplete = false;
        aces = twos = threes = fours = fives = sixes = -1;
        threeOfAKind = fourOfAKind = fullHouse = smallStraight = largeStraight = yahtzee = chance = -1;
        yahtzeeBonus = 0;
    }
    
    //This section for the upper section of a yahtzee score card
    public void scoreTopSection(int rollTotal, int diceFace){
        switch(diceFace){
            case 1:
                if(aces == -1){
                    aces = rollTotal;}
            break;
            case 2:
                if(twos == -1){
                    twos = rollTotal;}
            break;
            case 3:
                if(threes == -1){
                    threes = rollTotal;}
            break;
            case 4:
                if(fours == -1){
                    fours = rollTotal;}
            break;
            case 5:
                if(fives == -1){
                    fives = rollTotal;}
            break;
            case 6:
                if(sixes == -1){
                    sixes = rollTotal;}
            break;
        }
    }
    //This section for the lower section of a yahtzee score card
    public void scoreThreeOfAKind(int totalScore){
        if(threeOfAKind == -1){
            threeOfAKind = totalScore;
        }
    }
    
    public void scoreFourOfAKind(int totalScore){
        if(fourOfAKind == -1){
            fourOfAKind = totalScore;
        }
    }
    
    public void scoreFullHouse(){
        if(fullHouse == -1){
            fullHouse = 25;
        }
    }
    
    public void scoreSmallStraight(){
        if(smallStraight == -1){
            smallStraight = 30;
        }
    }
    
    public void scoreLargeStraight(){
        if(largeStraight == -1){
            largeStraight = 40;
        }
    }
    
    public void scoreYahtzee(){
        if(yahtzee == -1){
            yahtzee = 50;
        } else if(yahtzee == 50){
            yahtzeeBonus += 1;
        }
    }
    
    public void scoreChance(int rollTotal){
        if(chance == -1){
            chance = rollTotal;
        }
    }
    //All other methods
    public void verifyComplete(){
        if(aces != -1 && twos != -1 && threes != -1 && fours != -1 && fives != -1 && sixes != -1 && threeOfAKind != -1
           && fourOfAKind != -1  && fullHouse != -1 && smallStraight != -1 && largeStraight != -1 && yahtzee != -1 && chance != -1){
            isComplete = true;
        } else {
            isComplete = false;
        }
    }
    
    public int returnFinalScore(){
        if(isComplete){
            int upperSectionValue = aces + twos + threes + fours + fives + sixes;
            if(upperSectionValue >= 63){
                totalScore += 35;
            }
            totalScore += aces + upperSectionValue + threeOfAKind + fourOfAKind + fullHouse + smallStraight + largeStraight + yahtzee + chance;
            totalScore += 100 * yahtzeeBonus;
            return totalScore;
        } else {
            return -1;
        }
    }
}
