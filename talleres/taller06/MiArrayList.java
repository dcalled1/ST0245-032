import java.util.Arrays;
/**
 *
 * @author david
 */
public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 
    
    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MiArrayList() {
        elements=new int[DEFAULT_CAPACITY];
        size=0;
    }     

    
    // Retorna el tamaño de la lista 
    public int size() {
        return size;
    }   
    
    // Agrega un elemento e a la última posición de la lista
    public void add(int e) {
        if(size<elements.length) {
            elements[size]=e;
            size+=1;
        } else {
            elements=Arrays.copyOf(elements,size+DEFAULT_CAPACITY);
            add(e);
        }
    }    
    
    
    // Retorna el elemento que se encuentra en la posición i de la lista 
    public int get(int i) {
        if(i>=size) throw new ArrayIndexOutOfBoundsException();
        return elements[i];
    }
    
    
    // Agrega un elemento e en la posición index de la lista
    public void add(int index, int e) {
        
    } 
}
