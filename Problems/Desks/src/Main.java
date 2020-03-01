import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int desks = students/2+students%2;
        students =0;
        students = scanner.nextInt();
        desks += students/2+students%2;
        students =0;
        students = scanner.nextInt();
        desks += students/2+students%2;
       System.out.println(desks);
    }
}