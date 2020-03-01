import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Byte count = 0;
        boolean flag = true;
        for (int i = 0;flag ; i++) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print(i+" ");
                count++;
                if(count == num)
                {
                    flag = false;
                    break;
                }
            }
        }
    }
}