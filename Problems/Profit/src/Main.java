import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double current = scanner.nextInt();
        double percent = scanner.nextInt();
        double goal = scanner.nextInt();
        int length = 0;
        while (current < goal){
            current *= (1 + percent / 100);
            length++;
        }
        System.out.print(length);
    }
}