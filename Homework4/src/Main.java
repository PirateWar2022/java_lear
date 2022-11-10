import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algor a = new algor();
        ArrayList<String> name_list = new ArrayList<>();
        ArrayList<String> gender_list = new ArrayList<>();
        ArrayList<Integer> age_list = new ArrayList<>();



        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1 - add person, 2 - print all ");
            Integer slave1 = scanner.nextInt();

            if (slave1 == 1) {
                a.File_writer(a.Name(), a.Gender(), a.Age());
                flag = false;
            }else {
                flag = false;
            }

        }
        System.out.println(name_list);
        System.out.println(gender_list);
        System.out.println(age_list);

    }
}