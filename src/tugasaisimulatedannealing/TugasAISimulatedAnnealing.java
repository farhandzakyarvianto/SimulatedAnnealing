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
public class TugasAISimulatedAnnealing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print(String.format("%12s %12s", "x1", "|"));
        System.out.print(String.format("%12s %12s", "x2", "|"));
        System.out.print(String.format("%19s %4s", "Hasil Fungsi", "|"));
        System.out.print(String.format("%19s %5s", "Best So Far", "|"));
        System.out.println(String.format("%15s %3s", "Temperatur", ""));
        
        new SimulatedAnnealing().core();
        
    }
    
}
