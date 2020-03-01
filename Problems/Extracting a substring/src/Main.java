import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a,b;
        String str;
        str = scanner.nextLine();
        a = scanner.nextShort();
        b = scanner.nextShort();
        System.out.println(str.substring(a,b+1));
    }
}