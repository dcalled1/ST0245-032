/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author David´s PC
 */
public class punto1 {

    public punto1() {}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        punto1 p=new punto1();
        int n=1001;
        int n2=18;
        Array a=new Array(3,n,false);
        System.out.println("suma: "+p.sumarArreglo(a.getArray(),n-1)+". maximo= "+p.maxElm(a.getArray(),n-1)+". fibonacci con "+n2+" : "+p.fibonacci(n2));
    }
    
    public long sumarArreglo(int[] a,int n) {
        if(n==0) return a[n];
        return a[n]+sumarArreglo(a,n-1);
    }
    
    public int maxElm(int[] a,int n) {
        int max,tmp;
        if(n==0) max=a[0];
        else {
          max=a[n];
          tmp=maxElm(a,n-1);
          if(max<tmp) max=tmp;
        } return max;
    }
    
    public long fibonacci(int n) {
        if(n<=1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
