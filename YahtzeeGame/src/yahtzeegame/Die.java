/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeegame;

import java.util.Random;

/**
 *
 * @author Brendan
 */
public class Die {
    private int currentFace;
    private Random random = new Random();
    private boolean isLocked;
    //isLocked prevents die from being rolled
    
    public Die() {
        currentFace = 1;
        isLocked = false;
    }
    
    public void roll(){
        if(isLocked){
            System.out.println("tried to roll locked die");
        } else {
            currentFace = random.nextInt(6)+1;
        }
    }
    
    public int getCurrentFace() {
        return currentFace;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }
}
