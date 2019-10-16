/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barista.models;

/**
 *
 * @author Mohammed Hussein
 */
public class CoffeeMaker {
    
    private int cups = 0;
    private int timeSinceLastBrew = 0;
    
    public CoffeeMaker(int cups){
        this.cups = cups;
    }

    // getters
    public int getTimeSinceLastBrew() {
        return this.timeSinceLastBrew;
    }
    public int getCupsRemaining() {
        return this.cups;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        return this.cups > 0;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) throws IllegalTimeException {
        if (time < 0){
            throw new IllegalTimeException();
        }
    }

    //REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water) throws BeansAmountException, IllegalTimeException{
        if (beans > 2.40 && beans < 2.60 && water > 14.75){
            this.setTimeSinceLastBrew(0);
            this.cups = 20;
            System.out.println("Rebrewing the machine");
        } else {
            throw new BeansAmountException();
        }
    }

    ///REQUIRES: cups remaining > 0, time since last brew < 60 (DONE)
    //MODIFIES: this (DONE)
    //EFFECTS: subtracts one cup from cups remaining (DONE)
    public void pourCoffee() throws Exception{
        if (cups <= 0 && getTimeSinceLastBrew() < 60){
            throw new BeansAmountException();
        }
        this.cups--;
        setTimeSinceLastBrew(0);
        System.out.println("Pouring coffee...");
        System.out.println("current number of cups is " + cups);
    }
}
