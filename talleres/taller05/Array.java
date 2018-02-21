

import java.util.Random;

public class Array
{
    int typ,n;
    boolean rep;
    int[] Arr;
    
    public Array(int typ,int n, boolean rep) {
        this.typ=typ;
        this.n=n;
        this.rep=rep;
        Arr=new int[n];
        llenar();
    }
    
    public int[] getArray() {
        return Arr;
    }
    
    public int getn() {
        return n;
    }
    
    public int getTyp() {
        return typ;
    }
    
    public boolean getRep() {
        return rep;
    }
    
    private void llenar() {
            switch(typ) {
                case 1:
                    int a=-1;    
                    for(int i=0; i<n-1;i++) {
                        a+=1;
                        Arr[i]=a;
                    }
                    break;
                case 2:
                    int b=n;    
                    for(int i=0; i<n-1;i++) {
                        b-=1;
                        Arr[i]=b;
                    }
                    break;
                case 3:
                    if(rep) {
                        for(int i=0;i<n;i++) Arr[i]=(int)(Math.random()*n);
                        break;
                    } else {
                        Random r=new Random();
                        for(int i=0;i<n;i++)Arr[i]=i;
                        for (int i=n;i>0;i--) {
                            int pos=r.nextInt(i);
                            int temp=Arr[i-1];
                            Arr[i-1]=Arr[pos];
                            Arr[pos]=temp;
                        }
                    }
                    break;
                default:
                    System.out.println("Tipo irreconocible.");
            }
    }
    
    public void imprimirArreglo() {
        System.out.print(Arr[0]);
        for(int i=1;i<n;i++) System.out.print(", "+Arr[i]);
        System.out.println();
    }
}