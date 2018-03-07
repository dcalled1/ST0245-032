import java.util.Arrays;
/**
 *
 * @author david
 */
public class MyArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 
    
    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MyArrayList() {
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
            size++;
        } else {
            elements=Arrays.copyOf(elements,elements.length+DEFAULT_CAPACITY);
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
        if(index>elements.length) {
            for(int i=elements.length-1;i>index;i--) elements[i]=elements[i-1];
            elements[index]=e;
            if(index>size) size++;
            else size=index+1;
        } else {
            elements=Arrays.copyOf(elements,elements.length+DEFAULT_CAPACITY);
            add(index,e);
        }
    }
    
    @Override
    public String toString() {
      String s="";
      for(int i=0;i<size;i++) s+=elements[i]+",";
      s+=elements[size];
      return s;
    }
}
