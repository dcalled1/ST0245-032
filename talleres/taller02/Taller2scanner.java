/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller2 {

    

//    public static int punto1(int a, int b){
//       
//    while(b != 0){
//         int t = b;
//         b = a % b;
//         a = t;
//    }
//    return a;
//}
    
     public boolean groupSum(int start, int[] nums, int target){
        
          if(start>= nums.length ){
              return target == 0;
          }else{
              return groupSum(start+1, nums, target - nums[start]) || groupSum(start+1, nums, target);
          }
    }
     
    public static void main(String[] args) {
        System.out.println("Ingrese a");
        Scanner sc = new Scanner(System.in);
       int a;
       a = sc.nextInt();
        System.out.println("Ingrese b");
        int b = sc.nextInt();
       
      while(b != 0){
         int t = b;
         b = a % b;
         a = t;
    }
   
        System.out.println(a);   
    }
    
   
}
