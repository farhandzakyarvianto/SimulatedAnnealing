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
public class SimulatedAnnealing {
    
    double coolingRate   = 0.999;
    double temp          = 1000;
    double minTemp       = 1;
    
    public void core(){
        
        State newState          = Fungsi.nilaiX();
        State currentState      = newState;
        double bestSoFar        = Fungsi.hitungFungsi(newState);
        double tempBestSoFar    = bestSoFar;
        double prob;
        
        //while temp value still more than minTemp
        while(temp > minTemp){
            
            //formating print
            System.out.print(String.format("%21s %3s", currentState.getX1(), "|"));
            System.out.print(String.format("%21s %3s", currentState.getX2(), "|"));
            System.out.print(String.format("%21s %3s", tempBestSoFar, " | "));
            System.out.print(String.format("%21s %3s", bestSoFar, " | "));
            System.out.println(temp);

            double rand = Math.random();
            
            newState        = Fungsi.nilaiX();
            currentState    = newState;
            tempBestSoFar   = Fungsi.hitungFungsi(newState);

            if (tempBestSoFar < bestSoFar){
                bestSoFar       = tempBestSoFar;
                currentState    = newState;
            }
            else{
                prob = Math.exp(-(tempBestSoFar - bestSoFar)/temp);
                if (prob > rand){
                    currentState    = newState;
                }
            }
            
            temp *= coolingRate;
            
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Best so Far : " + bestSoFar);
        System.out.println("----------------------------------------------");   
    }
}


