
/**
 * Clase que representa los toboganes y escaleraes definidos por
 * una casilla de inicio y una casilla final para luego
 * implementarlos en el tablero.
 * 
 * @author (Andres Fandos Villanueva, Claudia Gonzalo Gimeno) 
 * @version (a version number or a date)
 */
public class TobEsc
{
    private int inicio;//Atributo que simulara el inicio del objeto TOBOGAN o ESCALERA.
    private int fin;//Atributo que simulara el final del objeto TOBOGAN o ESCALERA.
    /**
     * Constructor que crea los objetos TOBOGAN o ESCALERA,
     * caracterizados por tener un inicio y un final.
     */
    public TobEsc(int in, int fine){
        this.inicio=in;
        this.fin=fine;
    }
    /**
     * Metodo que devuelve la casilla de inicio del tobogan o escalera 
     * objeto dueño.
     */
    public int getInicio() { 
        return this.inicio;
    }
    /**
     * Metodo que devuelve la casilla de finalizacion del tobogan o escalera 
     * objeto dueño.
     */
     public int getFinal() { 
        return this.fin;
    }
    /**
     * Metodo booleano que devuelve "true" si el objeto dueño es una
     * escalera, o false si es un tobogan.
     */
    public boolean getEsEsc(){
        boolean escalera=false;
        if(this.inicio < this.fin){
            escalera=true;
        }
        return escalera;
    }
    /**
     * Metodo booleano que devuelve "true" si el objeto dueño es un
     * tobogan, o false si es una escalera.
     */
    public boolean getEsTob(){
        boolean tobogan=false;
        if(this.inicio > this.fin){
            tobogan=true;
        }
        return tobogan;
    }
}
