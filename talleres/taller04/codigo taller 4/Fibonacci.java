/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David´s PC
 */
public class Fibonacci {
    public Fibonacci() {}
    
    public long fibonacci(int n) {
        if(n<=1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
