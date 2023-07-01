// calcular area de un rectangulo
import java.util.Scanner;

public class areaRec{
    public static void main(String[] args){
        // declaracion de variables
        double area, base, altura;
        //declaracion del scanner herramienta para leer datos
        Scanner kb = new Scanner(System.in);
        // solicitar datos a  usuario
        System.out.println("Ingresa la base");
        base= kb.nextDouble();
        System.out.println("Ingresa la altura");
        altura= kb.nextDouble();
        // multiplicacion de la base x altura para calcular el area
        area=base*altura;
        //imprimir resultado
        System.out.println("el area del rectangulo es "+ area);
        //cerrar escaner
        kb.close();
    }
}