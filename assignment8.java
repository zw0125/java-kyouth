import java.util.Scanner;

public class assignment8 {
    private String name;
    private int age;
    private double height;
    private double weight;

    // Getters

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    // Setters

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }

    public void setHeight(double height){
        if (height > 0){
            this.height = height;
        }
    }

    public void setWeight(double weight){
        if (weight > 0){
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        assignment8 person = new assignment8();
        
        System.out.print("Enter name: ");
        person.setName(scanner.nextLine());

        System.out.print("Enter age: ");
        person.setAge(scanner.nextInt());

        System.out.print("Enter height in cm: ");
        person.setHeight(scanner.nextDouble());

        System.out.print("Enter weight in kg: ");
        person.setWeight(scanner.nextDouble());

        double bmi = (person.getHeight()-100)/person.getWeight()  ;

        System.out.println("The person name is " + person.getName() + " and he/she is " + person.getAge() + " years old and his/her bmi is " + bmi);

        scanner.close();
    }
}
