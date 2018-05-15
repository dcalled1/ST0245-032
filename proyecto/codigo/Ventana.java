
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Ventana extends JFrame {
    
    /** Crea una ventana que contiene un Quadtree
     *
     * @param x anchura de la ventana
     * @param y altura de la ventana
     * @param qt Quadtree a a mostrar
     */
    public Ventana(int x,int y,Quadtree qt) {
        super("Abejas");
        setSize(x,y);
        add(qt);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
}
