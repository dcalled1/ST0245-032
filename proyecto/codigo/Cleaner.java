
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Cleaner {

    /**
     */
    public Cleaner() {}
    
    public static void main(String[] args) {
        try {
            int escala=1;
            int numeroAbejas=100000;
            int rango=100;
            boolean mostrarGrafica=false;
            boolean imprimirArbol=false;
            
            String printerName="ColisionesCon"+numeroAbejas+"abejas.txt";
            PrintWriter printer=new PrintWriter(new FileWriter(printerName));
            String fileName="ConjuntoDeDatosCon"+numeroAbejas+"abejas.txt";
            double x,y;
            Scanner abejas=new Scanner(new File(fileName));
            Bee[] bees=new Bee[numeroAbejas];
            ArrayList<int[]> beesInDanger=new ArrayList<>();
            ArrayList<Bee> beesInRange;
            abejas.useDelimiter(",");
            Quadtree qt=new Quadtree(new Rectangle(20,20,100000.0/9.0+20.0,70000.0/9.0+20.0),escala);
            qt.setBackground(Color.black);
            qt.setSize(1400,1000);
            for(int i=1;abejas.hasNextLine();i++) {
                x=Double.parseDouble(abejas.next());
                y=Double.parseDouble(abejas.next());
                bees[i-1]=new Bee(x,y,i);
                qt.insert(bees[i-1]);
                System.out.println("Abeja #"+i+" añadida en " +x+", "+y);
            }
            abejas.close();
            if(imprimirArbol) qt.print();
            for (Bee bee : bees) {
                beesInRange = qt.query(new Circle(bee.getX(), bee.getX(), rango));
                for (int j = 0; j<beesInRange.size(); j++) {
                    if (beesInRange.get(j).getID() > bee.getID()) beesInDanger.add(new int[]{bee.getID(), beesInRange.get(j).getID()});
                }
            }
            for(int i=0;i<beesInDanger.size();i++){
                System.out.print(beesInDanger.get(i)[0]+" - "+beesInDanger.get(i)[1]+". ");
                printer.println(beesInDanger.get(i)[0]+", "+beesInDanger.get(i)[1]);
            } System.out.println("\nCalculo Completado. ");
            printer.close();
            Ventana v;
            if(mostrarGrafica) v=new Ventana(1500/escala,1050/escala,qt);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
