import java.util.*;
/**
 * Clase que representa el tablero de juego, definido por 
 * dos objetos escalera y dos objetos tobogan. 
 * Además, aquí se encuentran los métodos para cambiar las 
 * casillas de cada jugador en función del número obtenido 
 * en el dado o de si caen en uno de los toboganes o escaleras. 
 * Por último, aquí también se encuentra el método "juego",
 * donde está el código que desarrolla todo el juego.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Tablero
{
    private TobEsc escalera1;//Atributo de una de las dos escaleras que formarán el tablero. 
    private TobEsc escalera2;//Atributo de una de las dos escaleras que formarán el tablero. 
    private TobEsc tobogan1;//Atributo de uno de los dos toboganes que formarán el tablero. 
    private TobEsc tobogan2;//Atributo de uno de los dos toboganes que formarán el tablero. 
    private int casillaJ1=1;//Variable que simula la casilla en la que se encuentra el Jugador1.
    private int casillaJ2=1;//Variable que simula la casilla en la que se encuentra el Jugador2.
    /**
     * Constructor del tablero, formado por 2 objetos escalera, y 2 objetos tobogán.
     */
    public Tablero(TobEsc escalera1, TobEsc escalera2, TobEsc tobogan1, TobEsc tobogan2)
    {
        this.escalera1 = escalera1;
        this.escalera2 = escalera2;
        this.tobogan1 = tobogan1;
        this.tobogan2 = tobogan2;
    }
    /**
     * Metodo que devuelve la casilla en la que se encuentra el Jugador1.
     */
    private int casillaActualJ1(){
        return casillaJ1;
    }
    /**
     * Metodo encargado de modificar y devolver la casilla del Jugador1 en funcion del
     * numero obtenido en el dado, o de si cae en un tobogan o una escalera.
     */
    private int setCasillaActualJ1 (Dado d){
        int inicioA = this.escalera1.getInicio();
        int finA = this.escalera1.getFinal();
        int inicioB = this.escalera2.getInicio();
        int finB = this.escalera2.getFinal();
        int inicioC = this.tobogan1.getInicio();
        int finC = this.tobogan1.getFinal();
        int inicioD = this.tobogan2.getInicio();
        int finD = this.tobogan2.getFinal();
        int casillaActual=casillaActualJ1()+d.getNum();
        if(casillaActual!=inicioA && casillaActual!=inicioB && casillaActual!=inicioC && casillaActual!=inicioD || casillaActual>100)
            casillaJ1=casillaActual;
        else if(casillaActual==inicioA && escalera1.getEsEsc())
            casillaJ1=finA;
        else if(casillaActual==inicioA && escalera1.getEsTob())
            casillaJ1=finA;
        else if(casillaActual==inicioB && escalera2.getEsEsc())
            casillaJ1=finB;
        else if(casillaActual==inicioB && escalera2.getEsTob())
            casillaJ1=finB;
        else if(casillaActual==inicioC && tobogan1.getEsEsc())
            casillaJ1=finC;
        else if(casillaActual==inicioC && tobogan1.getEsTob())
            casillaJ1=finC;
        else if(casillaActual==inicioD && tobogan2.getEsEsc())
            casillaJ1=finD;
        else if(casillaActual==inicioD && tobogan2.getEsTob())
            casillaJ1=finD;
        else if ((casillaActualJ1()+d.getNum())>100) casillaJ1 = casillaActual-d.getNum();
        return casillaJ1;
    }
    /**
     * Metodo para modificar y asignarle la casilla 1 al Jugador1 (casilla de inicio)
     * cuando le salgan tres seises seguidos.
     */
    private int setCasillaJ1 (int n){
        return casillaJ1=n;
    }
    /**
     * Metodo String para mostrar por pantalla en que casilla esta el Jugador1.
     */
    public String mostrarCasillaActualJ1(){
        return "El jugador 1 está en la casilla "+ casillaActualJ1();
    }
    /**
     * Metodo que devuelve la casilla en la que se encuentra el Jugador2.
     */
    private int casillaActualJ2(){
        return casillaJ2;
    }
    /**
     * Metodo encargado de modificar y devolver la casilla del Jugador2 en funcion del
     * numero obtenido en el dado, o de si cae en un tobogan o una escalera.
     */
    private int setCasillaActualJ2 (Dado d){
        int inicioA = this.escalera1.getInicio();
        int finA = this.escalera1.getFinal();
        int inicioB = this.escalera2.getInicio();
        int finB = this.escalera2.getFinal();
        int inicioC = this.tobogan1.getInicio();
        int finC = this.tobogan1.getFinal();
        int inicioD = this.tobogan2.getInicio();
        int finD = this.tobogan2.getFinal();
        int casillaActual=casillaActualJ2()+d.getNum();
        if(casillaActual!=inicioA && casillaActual!=inicioB && casillaActual!=inicioC && casillaActual!=inicioD)
            casillaJ2=casillaActual;
        else if(casillaActual==inicioA && escalera1.getEsEsc())
            casillaJ2=finA;
        else if(casillaActual==inicioA && escalera1.getEsTob())
            casillaJ2=finA;
        else if(casillaActual==inicioB && escalera2.getEsEsc())
            casillaJ2=finB;
        else if(casillaActual==inicioB && escalera2.getEsTob())
            casillaJ2=finB;
        else if(casillaActual==inicioC && tobogan1.getEsEsc())
            casillaJ2=finC;
        else if(casillaActual==inicioC && tobogan1.getEsTob())
            casillaJ2=finC;
        else if(casillaActual==inicioD && tobogan2.getEsEsc())
            casillaJ2=finD;
        else if(casillaActual==inicioA && tobogan2.getEsTob())
            casillaJ2=finD;
        else if (casillaActual > 100)
            casillaJ2=casillaActualJ2();
        else if ((casillaActualJ2()+d.getNum())>100) casillaJ2 = casillaActual-d.getNum();
        return casillaJ2;
    }
    /**
     * Metodo para modificar y asignarle la casilla 1 al Jugador2 (casilla de inicio)
     * cuando le salgan tres seises seguidos.
     */
    private void setCasillaJ2 (int n){
        casillaJ2=n;
    }
    /**
     * Metodo String para mostrar por pantalla en que casilla esta el Jugador2.
     */
    public String mostrarCasillaActualJ2(){
        return "El jugador 2 está en la casilla "+ casillaActualJ2();
    }
    /**
     * Metodo en el que se encuentra todo el desarrollo del juego una vez establecidos
     * los toboganes y las escaleras que tiene el tablero (estos se implementan en
     * la calse "menu").
     */
    public void juego(){
           Scanner t=new Scanner (System.in);
           do{    
                int it=0;
                Dado dadito1;
                do{
                    dadito1= new Dado();
                    if(it<1)
                        System.out.print("• Pulsa enter para lazar el dado Jugador1");
                    t.nextLine();
                    System.out.println("\nNumero obtenido en el dado: "+dadito1.getNum());
                    if (it<3){
                        if(casillaActualJ1() + dadito1.getNum() > 100){
                            System.out.println("\nSuperaste la casilla 100 Jugador1, te quedas donde estabas.");
                        }
                        else {
                            setCasillaActualJ1(dadito1);
                            System.out.println("Jugador1, avanzas "+dadito1.getNum()+" casillas");
                        }    
                        System.out.println("\n\n"+mostrarCasillaActualJ1());
                        System.out.println(mostrarCasillaActualJ2()+"\n\n");
                    }
                    it+=1;
                    if (dadito1.getNum()==6 && it<3 && casillaActualJ1()!=100) System.out.print ("Sacaste un 6 Jugador1! Tiras de nuevo");
                    if(it==3 && dadito1.getNum()==6){
                        System.out.println("Lastima Jugador1, sacaste tres veces seguidas el 6. Vuelves a la casilla inicial :(");
                        setCasillaJ1(1);
                        System.out.println("\n\n"+mostrarCasillaActualJ1());
                        System.out.println(mostrarCasillaActualJ2()+"\n\n");
                    }
                }while(dadito1.getNum()==6 && it<3);
                if(casillaActualJ1()!=100){
                    it=0;
                    do{
                        dadito1= new Dado();
                        if(it<1)
                            System.out.print("• Pulsa enter para lazar el dado Jugador2");
                        t.nextLine();
                        System.out.println("\nNumero obtenido en el dado: "+dadito1.getNum());
                        if (it<3){
                            if(casillaActualJ2() + dadito1.getNum() > 100){
                                System.out.println("Superaste la casilla 100 Jugador2, te quedas donde estabas.");
                            }
                            else {
                                setCasillaActualJ2(dadito1);
                                System.out.println("Jugador2, avanzas "+dadito1.getNum()+" casillas");
                            }   
                            System.out.println("\n\n"+mostrarCasillaActualJ1());
                            System.out.println(mostrarCasillaActualJ2()+"\n\n");
                        }
                        it+=1;
                        if (dadito1.getNum()==6 && it<3 && casillaActualJ2()!=100) System.out.print ("Sacaste un 6 Jugador2! Tiras de nuevo");
                        if(it==3 && dadito1.getNum()==6){
                            System.out.println("Lastima Jugador2, sacaste tres veces seguidas el 6. Vuelves a la casilla inicial :(");
                            setCasillaJ2(1);
                            System.out.println("\n\n"+mostrarCasillaActualJ1());
                            System.out.println(mostrarCasillaActualJ2()+"\n\n");
                        }
                    }while(dadito1.getNum()==6 && it<3);
                }
           }while(casillaActualJ2()<100 && casillaActualJ1()<100);
           if(casillaActualJ1()== 100){
                System.out.println("\n\nENHORABUENA JUGADOR1, HAS GANADO!!\n\n");
            }else if(casillaActualJ2() == 100){
                System.out.println("\n\nENHORABUENA JUGADOR2, HAS GANADO!!\n\n");
            }
    }
}
