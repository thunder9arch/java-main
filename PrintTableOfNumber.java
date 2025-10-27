// ...existing code...
import java.util.Scanner;

public class PrintTableOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            if (!sc.hasNextInt()) {
                System.out.println("Input is not an integer.");
                return;
            }
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d%n", n, i, n * i);
            }
        }
    }
}
// ...existing code...