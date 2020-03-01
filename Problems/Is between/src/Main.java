import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        boolean res1,res2;
        res1 = (a>=b)&&(a<=c);
        res2 = (a<=b)&&(a>=c);
        System.out.println(res1||res2);
    }
}