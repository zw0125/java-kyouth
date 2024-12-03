import java.util.Scanner;

public class assignment2_1 {
    
    private class Car {
        private String model;
        private String make;
        private double price;
    
        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }
    
        public double getPrice() {
            return price;
        }
    }
    
    public static void main(String[] args) {
        Double Price;
        Scanner scanner = new Scanner(System.in);
        assignment2_1 assignment = new assignment2_1();
    
        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);
    
        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        
        if(averagePrice>100000){
            System.out.println("The car is expensive");
        }else if (averagePrice>50000 && averagePrice< 99999){
            System.out.println("The cars is normal price");
        }else if (averagePrice<49999){
            System.out.println("The cars are cheap");
        }

        System.out.println("The average price of the cars is: " + averagePrice);
        }
    
    private Car getCarDetails(Scanner scanner) {
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car make:");
        String make = scanner.nextLine();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        return new Car(model, make, price);
    }
}

    
    

