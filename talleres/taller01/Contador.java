/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David´s PC
 */
public class Contador {
    
    private int incrementos;
    String id;
    
    public Contador(String id) {
        incrementos=0;
        this.id=id;
    }
    
    public void incrementar() {
        incrementos++;
    }
    
    public int getIncrementos() {
        return incrementos;
    }
    
    @Override
    public String toString() {
        
        return ""+incrementos;
    }
    /**
     * @param args the command line arguments
     */
}
