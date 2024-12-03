import java.util.Scanner;

public class assignmentFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] VIP = new String[5][2];
        String[][] Cheap = new String[5][2];

        int x = 0, y = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Car " + (i + 1) + ":");
            
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (price >= 70000) {
                VIP[x][0] = String.valueOf(price);
                VIP[x][1] = "VIP, 2024, pre-order";
                x++;
            } else {
                Cheap[y][0] = String.valueOf(price);
                Cheap[y][1] = "Cheap, old, for sale";
                y++;
            }
        }

        System.out.print("\nVIP Cars:");
        for (int i=0;i<5;i++) {
            if(VIP[i][0]!=null){
                System.out.print("\n");
                for(int j=0;j<2;j++){
                    System.out.print(VIP[i][j]+" ");
                }
            }
        }

        System.out.print("\n\nCheap Cars:");
        for (int i=0;i<5;i++) {
            if(Cheap[i][0]!=null){
                System.out.print("\n");
                for(int j=0;j<2;j++){
                    System.out.print(Cheap[i][j]+" ");
                }
            }
        scanner.close();
        }
    }
}

