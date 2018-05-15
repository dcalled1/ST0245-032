/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Rectangle {
    double x;
    double y;
    double height;
    double width;
    
    /** Crea un rectangulo igual al rectangulo r.
     *
     * @param r rectangulo a clonar
     */
    public Rectangle(Rectangle r) {
        x=r.getX();
        y=r.getY();
        height=r.getHeight();
        width=r.getWidth();
    }
    
    /**
     *
     * @param x Coordenada x del vértice superior izquierdo del rectangulo
     * @param y Coordenada x del vértice superior izquierdo del rectangulo
     * @param width Anchura del rectangulo
     * @param height Altura del rectangulo
     */
    public Rectangle(double x,double y,double width,double height) {
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
    }
    
    /**Retorna la coordenada x del vértice superior izquierdo del rectangulo
     *
     * @return Retorna la coordenada x del vértice superior izquierdo del rectangulo
     */
    public double getX() {
        return x;
    }
    
    /**Retorna la coordenada y del vértice superior izquierdo del rectangulo
     *
     * @return Retorna la coordenada y del vértice superior izquierdo del rectangulo
     */
    public double getY() {
        return y;
    }
    
    /**Retorna la altura del rectangulo
     *
     * @return Retorna la altura del rectangulo
     */
    public double getHeight() {
        return height;
    }
    
    /**Retorna la anchura del rectangulo
     *
     * @return Retorna la anchura del rectangulo
     */
    public double getWidth() {
        return width;
    }
    
    /** revisa si el circulo contiene a una abeja dada.
     *
     * @param bee abeja a revisar.
     * @return true si contiene a la abeja, false si no la contiene.
     */
    public boolean contains(Bee bee) {
         return (bee.getX()<=x+width &&
                 bee.getY()<=y+height &&
                 bee.getX()>=x &&
                 bee.getY()>=y);
    }
    
    /** Revisa si el rectangulo contiene un punto(x,y)
     *
     * @param x Coordenada x del punto
     * @param y Coordenada y del punto
     * @return True si contiene el punto, false si no lo contiene
     */
    public boolean contains(double x, double y) {
        return (x<=this.x+width &&
                y<=this.y+height &&
                x>=this.x &&
                y>=this.y);
    }
}
