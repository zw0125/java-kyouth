public class Assignemnt1 {
    private String name;
    private double price;
    private int year;
    
    public Assignemnt1 (String name, int price, int year){
        this.name=name;
        this.price=price;
        this.year=year;
    }

    public void displayDetail(){
        double PriceYearProduct = price * year;
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Manufacture Year: "+year);
        System.out.println("Car Calculation: RM" + PriceYearProduct);
    }

    public static void main(String[] args) {
        Assignemnt1 car = new Assignemnt1("Proton Saga", 50000, 2021);
        car.displayDetail();
    }
}
