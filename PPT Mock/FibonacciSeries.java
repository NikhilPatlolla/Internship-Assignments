import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " ");

        for (int i = 1; i < numTerms; i++) {
            System.out.print(secondTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}

