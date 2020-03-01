import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n,m,k;
        n  = scanner.nextInt();
        m  = scanner.nextInt();
        k  = scanner.nextInt();
        boolean res = false;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i*j == k){ res = true;break;}
            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(i*j == k) {res = true;break;}
            }
        }
        if(res)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}