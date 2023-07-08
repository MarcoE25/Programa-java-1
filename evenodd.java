import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        int ciclo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantas veces quieres que se cicle: ");
        ciclo = scanner.nextInt();
        for(int i = 1; i <= ciclo; i++){
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        if(num % 2 ==0 ){
        System.out.println(num + " is even.");
        }
        else{
                System.out.println(num + " is odd.");
        }
        }
scanner.close();
        }
}

