import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        short a,b,c,d;
        a= (short) (num/1000);
        b= (short) ((num-a*1000)/100);
        c= (short) ((num-a*1000-b*100)/10);
        d = (short) ((short) num - (a * 1000) - (b * 100) - (c * 10));
        if ((a==d)&&(b==c))
            System.out.println(1);
        else
            System.out.println(0);

    }
}