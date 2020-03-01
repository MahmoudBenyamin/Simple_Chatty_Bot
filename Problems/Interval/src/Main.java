import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean cond = ((num>-15)&&(num<=12))||((num>14)&&(num<17))||(num>=19);
        if(cond)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

