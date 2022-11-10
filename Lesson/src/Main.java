import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list_fname = new ArrayList<>();
        ArrayList<String> list_lname = new ArrayList<>();
        ArrayList<String> list_tname = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        LinkedList<Integer> key = new LinkedList<>();

        boolean flag = true;
        while (flag) {;
            Scanner scanner = new Scanner(System.in);
            Scanner scanner_age = new Scanner(System.in);

            System.out.println("ENter your fio: ");
            String fio = scanner.nextLine();
            System.out.println("Eneter ur age: ");
            Integer age = scanner_age.nextInt();
            list_age.add(age);
            String[] fio1 = fio.split(" ");
            if (fio1.length == 3) {
                list_fname.add(fio1[1]);
                list_lname.add(fio1[0]);
                list_tname.add(fio1[2]);
            } else if (fio1.length == 2) {
                list_lname.add(fio1[0]);
                list_fname.add(fio1[1]);
                list_tname.add("");
            } else {
                list_lname.add(fio1[0]);
                list_fname.add("");
                list_tname.add("");
            }
            key.add(list_fname.size()-1);
            System.out.println("Do u want enter next one? Y/N");
            Scanner scanner1 = new Scanner(System.in);
            String yn = scanner1.nextLine();
            if(yn.toUpperCase().equals("N")) {
                flag = false;
            }

        }
        // names = Arsenii, Anastatia, Sasha
        //age = 2, 5, 3
        //key = 0, 1, 2
        int cnt = key.size()-1; //2
        while (cnt > -1) {
            int max_age = list_age.get(key.get(cnt)); //3  2
            int index = cnt; // 3  2
            for (int i = 0; i < cnt; i++) {
                if (max_age < list_age.get(key.get(i))) {   // 3 < 2   3 < 5   2 < 3
                    max_age = list_age.get(key.get(i)); // 5 3
                    index = i; // 1 0
                }
            }

            int tmp = key.get(cnt); // 2
            key.set(cnt, key.get(index)); // 2 -> 1
            key.set(index, tmp); // 1 -> 2
            // key = 2, 0, 1   age = 3, 2, 5
            cnt--;
        }
//        for (int i = 0; i < list_lname.size(); i++) {
//            System.out.println(list_lname.get(i) + " " + list_fname.get(i) + " " + list_tname.get(i) + " " + list_age.get(key.get(i)));
//        }
        key.forEach(n -> System.out.println(list_fname.get(n) + " " + list_lname.get(n) + " " + list_tname.get(n) + " " + list_age.get(n)));
    }
}