public class Person {
    String name = "Ng Zi Wei";
    int age = 22;
    double height = 1.60;

    public void showPerson(){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My height is "+height);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
    }
}
