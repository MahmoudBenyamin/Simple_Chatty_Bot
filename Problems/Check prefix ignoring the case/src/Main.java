import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        String word = "j";
        String str1 = str.substring(0,1);
        System.out.println(str1.equalsIgnoreCase(word));
    }
}