import java.util.Scanner;
class Main {
    private static long factorial(int x){
        long result = 1;
        for (int i = x; i >1 ; i--) {
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int i =2;
        while (factorial(i)<=m)
            i++;
        System.out.println(i);
    }
}