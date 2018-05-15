
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Quadtree extends Canvas{
    private Quadtree ne,nw,se,sw;       //Atributos nativos de la clase.
    private Bee bee;
    
    private final Rectangle limit;      //Atributos internos de la clase.
    private boolean divided;
    
    private final int escaladorg,escala,escalaTotal;    //Atributos gráficos
    
    /**Constructor del arbol. Crea el arbol de basado en un rectangulo que contendrá
     *  todos los puntos(O abejas para el caso). Si no sabe usar el parametro escaladorgrafico, use el 1. 
     * @param limit Establece el límit (en forma de rectangulo) que va a contener a todas las abejas.
     * @param escaladorgrafico Es la escala(inversa) que se va a usar para escalar la gráfica(recomendado 1 o 2)
     */
    public Quadtree(Rectangle limit,int escaladorgrafico) {
        this.limit=new Rectangle(limit);
        divided=false;
        escala=8;
        this.escaladorg=escaladorgrafico;
        escalaTotal=escala*escaladorg;
    }
    
    /** Inserta la abeja "bee" en el Quadtree. Es recursivo.
     * El método divide el rectangulo inicial en 4, es decir, crea los 4 hijos (desde el método subdivide())
     * @param bee Abeja a insertar
     * @return retorna true si se logró ubicar la abeja, false si no.(Solo se requiere el retorno para efectos de optimización)
     */
    public boolean insert(Bee bee) {
        if(!limit.contains(bee)) return false;
        if(this.bee==null) {
            this.bee=new Bee(bee);
            return true;
        } else {
            if(!divided) subdivide();
            if(ne.insert(bee)) return true;
            else if(nw.insert(bee)) return true;
            else if(se.insert(bee)) return true;
            else if(sw.insert(bee)) return true;
        } return false;
    }
    
    private void subdivide() {
        double h=limit.getHeight();
        double w=limit.getWidth();
        double x=limit.getX();
        double y=limit.getY();
        Rectangle rne=new Rectangle(x+w/2,y,w/2,h/2);
        Rectangle rnw=new Rectangle(x,y,w/2,h/2);
        Rectangle rse=new Rectangle(x+w/2,y+h/2,w/2,h/2);
        Rectangle rsw=new Rectangle(x,y+h/2,w/2,h/2);
        ne=new Quadtree(rne,escaladorg);
        nw=new Quadtree(rnw,escaladorg);
        se=new Quadtree(rse,escaladorg);
        sw=new Quadtree(rsw,escaladorg);
        divided=true;
    }
    
    /** Crea una lista de todas las abejas dentro de un rango.
     *
     * @param range es el circulo que usa para determinar cuáles abejas estan contenidas en el
     * @return Una arrayList con las abejas que estan dentro del rango.
     */
    public ArrayList<Bee> query(Circle range) {
        ArrayList<Bee> list=new ArrayList<>();
        queryAux(range,list);
        return list;
    }
    
    private void queryAux(Circle range,ArrayList<Bee> list) {
        if(!range.intersects(limit) || bee==null) return;
        if(range.contains(bee)) list.add(bee);
        if(divided) {
            nw.queryAux(range, list);
            ne.queryAux(range, list);
            sw.queryAux(range, list);
            se.queryAux(range, list);
        }
    }
    
    /** Dibuja una representación a escala del Quadtree.
     *
     * @param g de la clase Graphic necesaria para dijubar.
     */
    public void display(Graphics g) {
        g.setColor(Color.white);
        g.drawRect((int)(limit.getX()/escalaTotal),(int)(limit.getY())/escalaTotal,(int)(limit.getWidth())/escalaTotal,(int)(limit.getHeight())/escalaTotal);
        if(bee!=null){
            g.fillOval((int)(bee.getX()/escalaTotal)+2, (int)(bee.getY()/escalaTotal)+2, 4, 4);
            //g.drawString(bee.toString(),(int)(bee.getX()/escalaTotal),(int)(bee.getY()/escalaTotal)+3);
        }
             if(divided) {
                ne.display(g);
                nw.display(g);
                se.display(g);
                sw.display(g);
                } 
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        display(g);
    }
    
    private void print(int n) {
        for(int i=0;i<n;i++) System.out.print("--");
        if(bee==null) System.out.println("null");
        else System.out.println("Subdivisión #"+n+". "+bee.imprimir());
        if(divided) {
           ne.print(n+1);
           nw.print(n+1);
           se.print(n+1);
           sw.print(n+1); 
        }
    }
    
    /** Imprime la información contenida en el Quadtree mediante divisiones.
     *
     */
    public void print() {
        print(0);
    }
     
    
}
