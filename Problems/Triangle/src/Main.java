import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        int a,b,c;
        Scanner scanner= new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        boolean cond = (a+b>c)&&(b+c>a)&&(a+c>b);
        if(cond)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}