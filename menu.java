import java.util.*;
/**
 * Clase que representa el menú del programa que simula
 * el juego.
 * 
 * @author
 * @version (a version number or a date)
 */
public class menu
{
    /**
     * Metodo main, aquí se encuentra el menú de inicio
     * del juego.
     */
    public static void main(String[]args){
        Scanner t=new Scanner (System.in);
        System.out.println("====================================================");
        System.out.println("         BIENVENIDO A TOBOGANES Y ESCALERAS");
        System.out.println("====================================================");
        int a=numeroCorrecto("\nPresione 1 para empezar a jugar\nPresione 2 para salir del programa\n",1,2);
        while (a!=2){
            System.out.println("\n¿Como desea introducir los toboganes y escaleras?");
            int z = numeroCorrecto("\nPresione 1 para introducirlos de forma manual\nPresione 2 para que el programa los genere de forma aleatoria\n",1,2);
            if (z==1)
            {
                int b,c,d,e,f,g,h,i;
                do  b=leerEntero("Inicio primera escalera: ");
                while(b<=1||b>=99);
                do c=leerEntero("Final primera escalera: ");
                while(c>=100||c<=b);
                System.out.println();
                do d=leerEntero("Inicio segunda escalera: ");
                while(d<=1||d>=99||d==b||d==c);
                do e=leerEntero("Final segunda escalera: ");
                while(e>=100||e<=d||e==b||e==c);
                System.out.println();
                do  f=leerEntero("Inicio primer tobogan: ");
                while(f>=100||f<=1||f==b||f==c||f==d||f==e);
                do  g=leerEntero("Final primer tobogan: ");
                while(g>=f||g<=1||g==b||g==c||g==d||g==e);
                System.out.println();
                do  h=leerEntero("Inicio segundo tobogan: ");
                while(h<=1||h>=100||h==b||h==c|h==d||h==e||h==f||h==g);
                do  i=leerEntero("Final segundo tobogan: ");
                while(i>=h||i<=1||i==b||i==c||i==d||i==e||i==f||i==g||i==h);
                TobEsc esc1=new TobEsc (b,c);
                TobEsc esc2=new TobEsc (d,e);
                TobEsc tob1=new TobEsc (f,g);
                TobEsc tob2=new TobEsc (h,i);
                Tablero tablero = new Tablero (esc1,esc2,tob1,tob2);
                System.out.println();
                System.out.println("Escalera 1 ("+b+"➟"+c+")");
                System.out.println("Escalera 2 ("+d+"➟"+e+")");
                System.out.println("Tobogan 1 ("+f+"➟"+g+")");
                System.out.println("Tobogan 2 ("+h+"➟"+i+")");
                System.out.println("\nQUE COMIENCE EL JUEGO!!\n");
                System.out.println("Recuerda! Si sacas un 6 vuelves a tirar, pero tres veces seguidas el 6 es volver a la casilla inicial");
                System.out.println("\n\n"+tablero.mostrarCasillaActualJ1());
                System.out.println(tablero.mostrarCasillaActualJ2()+"\n\n");
                tablero.juego();
            }
            if (z==2){
                int b,c,d,e,f,g,h,i;
                Random aleat=new Random();
                do  b=aleat.nextInt(99)+1;
                while(b<=1||b>=99);
                do c=aleat.nextInt(99)+1;
                while(c>=100||c<=b);
                do d=aleat.nextInt(99)+1;
                while(d<=1||d>=99||d==b||d==c);
                do e=aleat.nextInt(99)+1;
                while(e>=100||e<=d||e==b||e==c);
                do  f=aleat.nextInt(99)+1;
                while(f>=100||f<=1||f==b||f==c||f==d||f==e);
                do  g=aleat.nextInt(99)+1;
                while(g>=f||g<=1||g==b||g==c||g==d||g==e);
                do  h=aleat.nextInt(99)+1;
                while(h<=1||h>=100||h==b||h==c|h==d||h==e||h==f||h==g);
                do  i=aleat.nextInt(99)+1;
                while(i>=h||i<=1||i==b||i==c||i==d||i==e||i==f||i==g||i==h);
                TobEsc esc1=new TobEsc (b,c);
                TobEsc esc2=new TobEsc (d,e);
                TobEsc tob1=new TobEsc (f,g);
                TobEsc tob2=new TobEsc (h,i);
                Tablero tablero = new Tablero (esc1,esc2,tob1,tob2);
                System.out.println("\nEscalera 1 ("+b+"➟"+c+")");
                System.out.println("Escalera 2 ("+d+"➟"+e+")");
                System.out.println("Tobogan 1 ("+f+"➟"+g+")");
                System.out.println("Tobogan 2 ("+h+"➟"+i+")");
                System.out.println("\nQUE COMIENCE EL JUEGO!!\n");
                System.out.println("Recuerda! Si sacas un 6 vuelves a tirar, pero tres veces seguidas el 6 es volver a la casilla inicial");
                System.out.println("\n\n"+tablero.mostrarCasillaActualJ1());
                System.out.println(tablero.mostrarCasillaActualJ2()+"\n\n");
                tablero.juego();
            }
            a=leerEntero("\n\nPresione 1 para volver a jugar\nPresione 2 para salir del programa\n");
        } 
        System.out.print('\f');
        System.out.println("====================================================");
        System.out.println("                  HASTA LA PROXIMA");
        System.out.println("====================================================");
    }
    /**
     * Metodo para dar robusted al programa. Aunque metas un dato
     * incorrecto, se captura la excepción que lanza y continúa
     * la ejecución hasta que el dato es correcto.
     */
    private static int numeroCorrecto (String pregunta,int min, int max){
        Scanner entrada = new Scanner(System.in);
        int dato = 0 ;
        boolean malo ;
        String ss;
        do {
            malo = false;
            System.out.print (pregunta);
            try {
                dato = entrada.nextInt ();
            }
            catch (InputMismatchException e) {
                malo = true ;
            }
            if (min>dato||max<dato){
                malo = true;
            }
            if(malo){
                ss = entrada.nextLine();
                System.out.println("Opcion incorrecta, seleccione un numero valido");
            }
        } while (malo);
        return dato ;
    }
    /**
     * Metodo para dar robusted al programa. Aunque metas un dato
     * incorrecto, se captura la excepción que lanza y continúa
     * la ejecución hasta que el dato es correcto.
     */
    private static int leerEntero (String pregunta){
        Scanner entrada = new Scanner(System.in );
        int dato = 0 ;
        boolean malo ;
        String ss;
        do {
            malo = false;
            System.out.print ( pregunta );
            try {
                dato = entrada.nextInt ();
            }
            catch (InputMismatchException e) {
                malo = true ;
                ss = entrada.nextLine();
                System.out.println("Numero erroneo, introduce un numero valido");
            }
        } while (malo);
        return dato ;
    }
}

    
