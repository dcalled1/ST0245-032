/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David´s PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto1();
        Punto2();
        Punto3();
    }
    
     public static void Punto1() {
        int[] elem={
        5000,10000,15000,20000
        };
        ArrayMax mx=new ArrayMax();
        double start,end,stim;
        int max;
        for(int i=0; i<elem.length;i++) {
            System.out.println("iniciando...");
            int n=elem[i];
            Array ar=new Array(3,n,false);
            ar.llenar();
            System.out.println("Arreglo generado: ");
            ar.imprimirArreglo();
            start=System.nanoTime();
            max=mx.findMax(ar.getArray());
            end=System.nanoTime();
            stim=end-start;
            System.out.println("Elemento maximo encontrado: "+max+". Número de elementos: "+n+". Tiempo gastado(nanosegundos): "+stim);
        }
    }
    
    public static void Punto2() {
        int[] elem={
            10,15
        };
        Suma sm=new Suma();
        boolean esPosib;
        double start,end,stim;
        for(int i=0; i<elem.length;i++) {
            System.out.println("iniciando...");
            int n=elem[i];
            int ran=(int)(Math.random()*n);
            Array ar=new Array(3,n,false);
            ar.llenar();
            System.out.println("Arreglo generado: ");
            ar.imprimirArreglo();
            start=System.nanoTime();
            esPosib=sm.groupSum(0,ar.getArray(),ran);
            end=System.nanoTime();
            stim=end-start;
            if(esPosib) System.out.print("Se hallaron elementos que sumaran "+ran);
            else System.out.print("No se hallaron elementos que sumaran "+ran);
            System.out.println(". Número de elementos: "+n+". Tiempo gastado(nanosegundos): "+stim);
        }
    }
    
    public static void Punto3() {
        int[] fib={
            14,15,16
        };
        Fibonacci fb=new Fibonacci();
        double start,end,stim;
        long res;
        for(int i=0; i<fib.length;i++) {
            System.out.println("iniciando...");
            int n=fib[i];
            start=System.nanoTime();
            res=fb.fibonacci(n);
            end=System.nanoTime();
            stim=end-start;
            System.out.println("En la pocision "+n+" de la secusncia fibonacci está el nímero"+res +". Tiempo gastado(nanosegundos): "+stim);
        }
    }
    
    public long fibonacci(int n) {
        if(n<=1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
