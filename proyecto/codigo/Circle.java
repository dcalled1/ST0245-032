/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Circle {
    private final double x,y,rad;
    
    /** Crea un circulo cuyo centro esta en (x,y) con radio rad.
     *
     * @param x coordenada x del centro del circulo
     * @param y coordenada y del centro del circulo
     * @param rad radio del circulo
     */
    public Circle(double x, double y, double rad) {
        this.y=y;
        this.x=x;
        this.rad=rad;
    }
    
    /** Crea un circulo igual a circle.
     *
     * @param circle circulo a clonar.
     */
    public Circle(Circle circle) {
        y=circle.getY();
        x=circle.getX();
        rad=circle.getRad();
    }

    /**Retorna la coordenada y del centro del circulo.
     *
     * @return Retorna la coordenada y del centro del circulo.
     */
    public double getY() {
        return y;
    }

    /**Retorna la coordenada x del centro del circulo.
     *
     * @return Retorna la coordenada x del centro del circulo.
     */
    public double getX() {
        return x;
    }

    /**Retorna el redio del circulo.
     *
     * @return Retorna el redio del circulo.
     */
    public double getRad() {
        return rad;
    }
    
    /** Revisa si el circulo contiene a una abeja dada.
     *
     * @param bee abeja a revisar.
     * @return true si contiene a la abeja, false si no la contiene.
     */
    public boolean contains(Bee bee) {
        return Math.sqrt(Math.pow(bee.getX()-x,2)+Math.pow(bee.getY()-y,2))<=rad;
    }
    
    /** Verifica si 2 circulos se intersectan
     *
     * @param c el circulo a evaluar
     * @return true si el circulo intersecta con el circulo c, false si no intersectan.
     */
    public boolean intersects(Circle c) {
        return Math.sqrt(Math.pow(c.getX()-x, 2)+Math.pow(c.getY()-y, 2))<rad+c.getRad();
    }
    
    /** Verifica si el circulo se intersecta con un rectangulo
     *
     * @param r rectangulo a a evaluar
     * @return true si el circulo se intersecta con el rectangulo r, false si no se intersectan.
     */
    public boolean intersects(Rectangle r) {
        return (Math.sqrt(Math.pow(r.getX()-x,2)+Math.pow(r.getY()-y,2))<=rad ||
                (Math.abs(x-r.getX())<=rad &&
                Math.abs(y-r.getY())<=rad &&
                Math.abs(r.getX()+r.getWidth()-x)<=rad &&
                Math.abs(r.getY()+r.getHeight()-y)<=rad) ||
                r.contains(x,y));
    }
}
