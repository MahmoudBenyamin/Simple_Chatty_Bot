import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundreds = num/100;
        int tens = (num - hundreds*100)/10;
        int ones = num -hundreds*100-tens*10;
        System.out.println(ones*100+tens*10+hundreds);
    }
}