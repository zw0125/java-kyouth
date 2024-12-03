import java.util.Scanner;

public class CarManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] makes = new String[3];
        String[] models = new String[3];
        double[] prices = new double[3];
        double totalPrice = 0;

        System.out.println("Enter details for 3 cars:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Car " + (i + 1) + ":");
            System.out.print("Enter model: ");
            models[i] = scan.nextLine();
            System.out.print("Enter make: ");
            makes[i] = scan.nextLine();
            System.out.print("Enter price: ");
            prices[i] = scan.nextDouble();
            scan.nextLine();
            totalPrice += prices[i];
        }

        double averagePrice = totalPrice / 3;

        System.out.printf("\nThe average price of the cars is: $%.2f\n", averagePrice);

        System.out.println("\nDetails of the cars entered:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Car %d - Make: %s, Model: %s, Price: $%.2f\n", i + 1, makes[i], models[i], prices[i]);
        }
    }
}
