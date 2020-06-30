/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasaisimulatedannealing;

/**
 *
 * @author Farhandzaky
 */
public class State {
    private double x1;
    private double x2;

    //construction
    public State(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }
    
    
}
