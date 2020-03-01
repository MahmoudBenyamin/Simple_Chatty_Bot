import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        boolean crash = false;
        int crashnum = 0;
        for (int i = 1; i <= noOfBridges ; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight){
                crash = true;
                crashnum = i;
                break;
            }
        }
        if(crash)
            System.out.println("Will crash on bridge "+crashnum);
        else
            System.out.println("Will not crash");

    }
}