public class PersonPrivate {
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonPrivate (String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public void displayDetail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height +"m");
        System.out.println("Weight: "+weight +"kg");
    }

    public static void main(String[] args) {
        PersonPrivate personPrivate = new PersonPrivate("Ng Zi Wei", 22, 1.60, 52.5);
        personPrivate.displayDetail();
    }
}
