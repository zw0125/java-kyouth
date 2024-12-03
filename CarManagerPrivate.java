import java.util.Scanner;

public class CarManagerPrivate {
    private String model;
    private String make;
    private double price;;

    public CarManagerPrivate(String model, String make, double price){
        this.model=model;
        this.make=make;
        this.price=price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;

        System.out.println("Enter a number:");
        int Count = scanner.nextInt(); 

        System.out.println("Enter details for " + Count + " cars:");

        for (int i = 0; i < Count; i++) {
            System.out.println("\nCar " + (i + 1) + ":");

            System.out.print("Enter model: ");
            String model = scanner.nextLine();

            System.out.print("Enter make: ");
            String make = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            CarManagerPrivate car = new CarManagerPrivate(model, make, price);
            totalPrice+= car.price;
        }

        double averagePrice = totalPrice / Count;
        System.out.println("\nAverage Car Price: RM" + averagePrice);
    }
}

