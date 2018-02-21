/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;

/**
 *
 * @author David´s PC
 */
public class Taller5 {
    
    public Taller5() {}

    public static void main(String[] args) {
        Taller5 t=new Taller5();
        FileWriter f1=null;
        PrintWriter p1;
        FileWriter f2=null;
        PrintWriter p2;
        FileWriter f3=null;
        PrintWriter p3;
        int tab;
        long t1,t2,tf,sum;
        try {
            f1 = new FileWriter("punto1.csv");
            p1 = new PrintWriter(f1);
            f2 = new FileWriter("punto2.csv");
            p2 = new PrintWriter(f2);
            f3 = new FileWriter("punto3.csv");
            p3 = new PrintWriter(f3);
            for(int i=10000;i<=50000;i+=1000) {
                Array a=new Array(3,i,false);
                t1=System.nanoTime();
                sum=t.ArraySum(a.getArray());
                t2=System.nanoTime();
                tf=t2-t1;
                p1.println(i+","+tf);
            } System.out.println("p1");
            for(int i=100;i<=5000;i+=100) {
                t1=System.nanoTime();
                tab=t.tablas(i);
                t2=System.nanoTime();
                tf=t2-t1;
                p2.println(i+","+tf);
            } System.out.println("p2");
            for(int i=10000;i<=50000;i+=1000) {
                Array a=new Array(3,i,false);
                t1=System.nanoTime();
                t.ordenar(a.getArray());
                t2=System.nanoTime();
                tf=t2-t1;
                p3.println(i+","+tf);
            } System.out.println("p3");
        } catch (IOException e) {
        } finally {
           try {
           if (null != f1) f1.close();
           if (null != f2) f2.close();
           if (null != f3) f3.close();
           } catch (IOException e2) {
           }
        }
    }
    
    public int ArraySum(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        return sum;
    }

    public int tablas(int n) {
        int h=0;
        for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
                h=i*j;
        return h;
    }

    public void ordenar(int[] a) {
        int j,temp;
        for(int i=0;i<a.length;i++) {
            j=i;
            while(j>0 && a[j-1]>a[j]) {
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j-=1;
            }
        }
    }
    
}
