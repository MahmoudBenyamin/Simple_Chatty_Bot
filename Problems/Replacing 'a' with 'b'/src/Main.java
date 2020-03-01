import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String old = scanner.nextLine();
        String val = old.replace('a','b');
        System.out.println(val);
    }
}