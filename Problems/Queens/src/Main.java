import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x1,y1,x2,y2;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        boolean cond = ( x1 == x2)||(y1 == y2)||(Math.abs(x1-x2)==Math.abs(y1-y2));
        if (cond)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}