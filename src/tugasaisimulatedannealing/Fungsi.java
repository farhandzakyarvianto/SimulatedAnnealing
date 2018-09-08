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
public class Fungsi {
    public static double hitungFungsi(State state){
        double x1 = state.getX1();
        double x2 = state.getX2();
        
        double fungsi = ((4 - 2.1 * Math.pow(x1, 2) + (Math.pow(x1, 4)/3)) * Math.pow(x1, 2)) + (x1 * x2) + (-4 + 4 * Math.pow(x2, 2)) * Math.pow(x2, 2);
        return fungsi;
    }
    
    public static State nilaiX(){
        double maks = 10;
        double min  = -10;
        double x1  = min + Math.random() * (maks - min);
        double x2  = min + Math.random() * (maks - min);
        
        State newState = new State(x1, x2);
        return newState;
    }
}
