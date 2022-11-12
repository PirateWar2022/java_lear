import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algor a = new algor();

        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);

            System.out.println("1 - add person, 2 - print all ");
            Integer slave1 = scanner.nextInt();

            if (slave1 == 1) {

                System.out.println("Enter his full name: ");
                String full_name = scanner.next();

                System.out.println("Enter his gender: ");
                String gen = scanner.next();

                System.out.println("Enter his age: ");
                Integer his_age = scanner2.nextInt();

                a.File_writer(full_name, gen, his_age);


            } else if (slave1 == 2) {
                System.out.println("1 - sorting list, 2 - ordinary");
                Integer oneortwo = scanner1.nextInt();
                if (oneortwo == 2) {
                    System.out.println(a.Takeinfo());
                } else if (oneortwo == 1) {
                    System.out.println(a.sorting_to_lists(a.Takeinfo()));
                }else {
                    System.out.println("Error");
                }
            }

        }


    }
}