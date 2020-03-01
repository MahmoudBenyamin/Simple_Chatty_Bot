import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        while (n!= 1) {
            System.out.print(n + " ");
            // If n is odd
            if ((n%2) == 1)
                n = 3 * n + 1;
                // If even
            else
                n = n / 2;
        }
        System.out.println(n);

    }
}