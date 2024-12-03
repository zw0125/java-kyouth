import java.util.Scanner;

public class assignment6 {

    public static void main(String[] args) {
        String dayName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        int dayOfWeek = scanner.nextInt();
        scanner.nextLine();

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayName);
    }
    
}
