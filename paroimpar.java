// determina si el numero es par o impar
     import java.util.Scanner;

public class paroimpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
          if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
             scanner.close();
        }
    }
    
}
