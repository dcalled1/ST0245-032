/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller2 {

    public static int punto1(int a, int b){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el numero mas alto");
        a = sc.nextInt();
        
        System.out.println("Introduzca el numero mas bajo");
        b = sc.nextInt();
        
    while(b != 0){
         int t = b;
         b = a % b;
         a = t;
    }
    return a;
}
    public static void main(String[] args) {
        
        
        System.out.println(a);
        
    }
    
}
