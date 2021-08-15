/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeegame;

public class Player {
    private Die[] dice = new Die[5];
    ScoreCard card = new ScoreCard();

    public Player() {
        for (int i = 0; i <= 5; i++) {
            dice[i] = new Die();
        }
    }
    
    public void rollDice(){
        for (int i = 0; i <= 5; i++) {
            dice[i].roll();
        }
    }
}
