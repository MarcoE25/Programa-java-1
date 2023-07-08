// programa para sumar numeros enteros
import java.util.Scanner;

public class sumaNentero{
    public static void main(String[] args) {
        int n, sum = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " integers is "+ sum);

        scanner.close();
    }
}
