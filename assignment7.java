import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] option1 = new int[3][4];
        int[][] option2 = new int[2][3];

        System.out.println("Choose an option (1/2):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter values for a 3x4 matrix:");
                for (int i = 0; i < option1.length; i++) {
                    for (int j = 0; j < option1[i].length; j++) {
                        System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                        option1[i][j] = scanner.nextInt();
                    }
                }

                for (int i = 0; i < option1.length; i++) {
                    for (int j = 0; j < option1[i].length; j++) {
                        System.out.print(option1[i][j] + " ");
                    }
                    System.out.println();
                }

                break;

            case 2:
                System.out.println("Enter values for a 2x3 matrix:");
                for (int i = 0; i < option2.length; i++) {
                    for (int j = 0; j < option2[i].length; j++) {
                        System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                        option2[i][j] = scanner.nextInt();
                    }
                }
                
                System.out.println("\nYou entered the following 2x3 matrix:");
                for (int i = 0; i < option2.length; i++) {
                    for (int j = 0; j < option2[i].length; j++) {
                        System.out.print(option2[i][j] + " ");
                    }
                    System.out.println();
                }

                break;

            default:
                System.out.println("Invalid choice. Please restart the program and choose either 1 or 2.");
                break;
        } 
        scanner.close();   
    }    
}
