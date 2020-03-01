import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short duration,foodCostPerDay,flightCost,hotelNightCost;
        duration = scanner.nextShort();
        foodCostPerDay = scanner.nextShort();
        flightCost = scanner.nextShort();
        hotelNightCost = scanner.nextShort();
        System.out.println(duration*foodCostPerDay+(duration-1)*hotelNightCost+2*flightCost);
    }
}