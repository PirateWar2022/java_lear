import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {


        // Rectangle , count area and perimetr
        Rectangle rectangle = new Rectangle(2, 5);

        System.out.println(rectangle.GetArea());
        System.out.println(rectangle.GetPerimetr());

        // Polinorfizm

        Person person = new Person("Lev", "Kushnir", 2);
        Employee employee = new Employee("Arsenii", "Poliakov", 12, 123, 89213988, 342);
        Developer developer = new Developer("Vlad", "SOmebidy", 45, 123, 45324242, 2323, "Senior", "All");

        System.out.println(person.greeting());
        System.out.println(employee.greeting());
        System.out.println(developer.greeting());







    }
}