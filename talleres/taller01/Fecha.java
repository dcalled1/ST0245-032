/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David´s PC
 */
public class Fecha {
    
    private final byte dia;
    private final byte mes;
    private final int anno;
    private final boolean existe;
    
    public Fecha(int dia,int mes,int anno) {
        this.anno=anno;
        this.dia=(byte)dia;
        this.mes=(byte)mes;
        existe=esExistente(); //hace parte de la sección en desarrolo que se encuentra a partir de la linea 77
    }
    
    public static void main(String[] args) {
   	Fecha x=new Fecha(19,7,2001);
        Fecha y=new Fecha(21,05,2015);
        y.comparar(x);
    }
    public byte getDia() {
        return dia;
    }
     public byte getMes() {
         return mes;
     }
     
     public int getAnno() {
         return anno;
     }
     
     @Override
     public String toString() {
         return ""+dia+"/"+mes+"/"+anno;
     }
     
     public byte comparar(Fecha x) {
         if(dia==x.getDia() && mes==x.getMes() && anno==x.getAnno()) {
             System.out.println("Mismas fechas.");
             return 0;
         }
         if(anno>x.getAnno()) {
             System.out.println(toString()+" es antes de "+x.toString());
             return 1;
         }
         else if(anno<x.getAnno()) {
             System.out.println(toString()+" es después de "+x.toString());
             return 2;
         }
         else if(mes>x.getMes()) {
             System.out.println(toString()+" es antes de "+x.toString());
             return 1;
         }
         else if(mes<x.getMes()) {
             System.out.println(toString()+" es después de "+x.toString());
             return 2;
         }
         else if(dia>x.getDia()) {
             System.out.println(toString()+" es antes de "+x.toString());
             return 1;
         }
         else if(dia<x.getDia()) {
             System.out.println(toString()+" es después de "+x.toString());
             return 2;
         } return -1;    
     } 
     /*Seccion en desarrollo, aun no funciona al 100% (igualmente no hace parte de los requisitos básicos del taller)*/
    private boolean esExistente() {
        if(dia>0 && mes>0) { 
            switch(tipoDeMes()) {
                case 2:
                    if(esBisiesto()) return dia<=29;
                    else return dia<=28;
                case 1:
                    return dia<=31;
                case 3:
                    return dia<=30;
                default:
                    System.out.println("Fecha inexistente o mal escrita.");
                    return false;
            }
        } else {
            System.out.println("Dia o mes negativo.");
            return false;
        }
   }
    
    private byte tipoDeMes() {
        if(mes>12 || mes<1) {   //No existe
            System.out.println("Mes inexistente.");
            return 0;
        }   
        if(mes==2) {    //febrero
            System.out.println("Es febrero.");
            return 3;
        }   
        if(mes==4 ||mes==6 || mes==9 || mes==11) {  //meses de 30 dias
            System.out.println("Éste mes tiene 30 días.");
            return 2;
        }
        System.out.println("Este mes tiene 31 días.");
        return 1;   //meses de 31 dias/resto de meses
    }
    
    private boolean esBisiesto() {
        if(anno%4==0 && anno%100!=0 || anno%400==0) {   //Algoritmo tomado de https://es.wikipedia.org/wiki/A%C3%B1o_bisiesto#Algoritmo_computacional
            System.out.println("Año bisiesto!");
            return true;
        } System.out.println("No es año bisiesto.");
        return false;
    }
    /*Fin sección en desarrollo(favor no tomar en cuenta) */
    
}
