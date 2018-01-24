/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David´s PC
 */
public class Punto2D {
    
    private final float x;
    private final float y;
    
    public Punto2D(float x, float y) {
        this.x=x;
        this.y=y;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public float getRadio() {
        return (float)Math.sqrt(x*x+y*y);
    }
    
    public float getAngulo() {
        return (float)Math.atan2(x,y);
    }
    
    public float getDistancia(Punto2D punto2) {
        return (float)Math.sqrt(Math.pow(x-punto2.getX(), 2)+Math.pow(y-punto2.getY(), 2));
    }
}
