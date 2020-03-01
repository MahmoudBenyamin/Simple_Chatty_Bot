import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        boolean x,y,z;
        x= (a>0)&&(b<=0)&&(c<=0);
        y =(a<=0)&&(b>0)&&(c<=0);
        z =(a<=0)&&(b<=0)&&(c>0);
        System.out.println(x||y||z);
    }
}