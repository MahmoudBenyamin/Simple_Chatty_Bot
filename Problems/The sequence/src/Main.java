import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        short max = 0;
        short num = scanner.nextShort();
        while (num>0){
            short x = scanner.nextShort();
            if((x%4) == 0&&x>max)
                max =x;
            num--;


        }
        System.out.println(max);

    }
}