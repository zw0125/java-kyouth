import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        String [][] matrix = new String[3][2];
        double [] price = new double [3];

        /*String [][] matrix = new String[3][3];
        matrix[0][0] = "2019"; matrix[0][1] = "Proton"; matrix[0][2] = "50000"; 
        matrix[1][0] = "2020"; matrix[1][1] = "Honda"; matrix[1][2] = "60000"; 
        matrix[2][0] = "2022"; matrix[2][1] = "Toyota"; matrix[2][2] = "75000"; */

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            
            System.out.println("Enter model: ");
            matrix[i][0] = scanner.nextLine();
            
            System.out.println("Enter name: ");
            matrix[i][1] = scanner.nextLine();
            
            System.out.println("Enter price: ");
            price[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("Car with price above RM 50,000:");
        for (int i = 0; i < matrix.length; i++) {
            if (price[i]>50000){
                System.out.println(matrix[i][0] + " "+ matrix[i][1] + " RM "+ price[i]);
            }
        }
    }
}
