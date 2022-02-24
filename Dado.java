import java.util.*;
/**
 * Clase que representa un dado definido por
 * un valor aleatorio entre 1 y 6.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Dado
{
    private int num;//Atributo que simulara el numero obtenido en el dado en cada lanzamiento.
    /**
     * Constructor del dado, genera un objeto que tiene como atributo
     * un numero aleatorio del 1 al 6.
     */
    public Dado (){
        Random dado = new Random();
        this.num=dado.nextInt(6)+1;
    }
    /**
     * Metodo que devuelve el numero obtenido en el dado.
     */
    public int getNum(){
        return this.num;
    }
}
