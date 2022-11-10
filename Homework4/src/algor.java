import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class algor {

    public String Name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter his full name and gender: ");
        String full_name = scanner.nextLine();
        return full_name;

    }
    public String Gender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter his gender: ");
        String gen = scanner.nextLine();
        return gen;
    }
    public Integer Age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter his age: ");
        Integer his_age = scanner.nextInt();
        return his_age;
    }

    public void File_writer(String name, String gend, Integer age) {
        try (FileWriter writer = new FileWriter("Persons.txt")){
            writer.write(name + " | " + gend + " | " + age);

            writer.flush();
        }
        catch (IOException ex){
            System.out.println("Something error");
        }
    }
}
