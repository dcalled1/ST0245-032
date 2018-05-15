

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Bee {

    private final double lat,lon;
    private double x,y;
    private final int id;
    
    /** Crea una abeja con ID en una posición dada por latitud y longitud.
     *Ademas le establece una posición relativa en coordenadas (x,y)
     * @param lat Latitud de la abeja
     * @param lon Longitud de la abeja
     * @param id ID de la abeja
     */
    public Bee(double lat,double lon,int id) {
        this.lat=lat;
        this.lon=lon;
        this.id=id;
        pos();
    }
    
    /** Crea una abeja a partir de una abeja bee.
     *
     * @param bee Abeja a clonar
     */
    public Bee(Bee bee) {
        lat=bee.getLat();
        lon=bee.getLon();
        id=bee.getID();
        pos();
    }
    
    /**Retorna la coordenada x relativa de la abeja
     *
     * @return Coordenada x relativa de la abeja
     */
    public double getX() {
        return x;
    }
    
    /**Retorna la coordenada y relativa de la abeja
     *
     * @return Coordenada y relativa de la abeja
     */
    public double getY() {
        return y;
    }
    
    /**Retorna la atitud de la abeja
     *
     * @return Latitud de la abeja
     */
    public double getLat() {
        return lat;
    }
    
    /**Retorna la longitud de la abeja
     *
     * @return Longitud de la abeja
     */
    public double getLon() {
        return lon;
    }
    
    /**Retorna el ID de la abeja
     *
     * @return ID de la abeja
     */
    public int getID() {
        return id;
    }
    
    private void pos() {
        x=(Math.abs(lat)-75.5)*1000000.0/9.0;
        y=(Math.abs(lon)-6.3)*1000000.0/9.0;
    }
    
    /** Imprime una representación con los datos de la abeja
     *
     * @return String con los datos de la abeja
     */
    public String imprimir() {
        return "ID: "+id+", x: "+x+", y: "+y+", latitude: "+lat+", longitude: "+lon;
    }
    
    @Override
    public String toString() {
        return ""+id;
    }
    
    /** Compara 2 abejas para saber si son iguales
     *
     * @param bee abeja a comparar
     * @return true si son la misma abeja, false si no lo son.
     */
    public boolean isEqual(Bee bee) {
        return id==bee.getID();
    }
    
    /** Retorna la distancia entre 2 abejas
     *
     * @param bee Abeja a comparar
     * @return Distancia con otra abeja
     */
    public double getDist(Bee bee) {
        return Math.sqrt(Math.pow(x-bee.getX(), 2)+Math.pow(y-bee.getY(), 2));
    }
}
