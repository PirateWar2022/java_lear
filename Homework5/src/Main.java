import java.util.*;

public class Main {
    public static void main(String[] args) {

        int start = (int) System.currentTimeMillis();

        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Create scanners
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        // Enter fullname and age

        boolean bool = true;

        while (bool) {
            try {
                System.out.println("Mitä sinä haluat tehdä?, valitse. 1 - lisää uusi ihmesi, 2 - näytä kaikki, 3 - ulos");
                int num = scanner2.nextInt();

                if(num == 1) {
                    System.out.println("Mikä sun nimi on??");
                    String fullname = scanner.nextLine();

                    System.out.println("Kuinka vanha sä oot?");
                    int age = scanner1.nextInt();

                    String[] splitF = fullname.split(" ");

                    String fName = splitF[0];
                    String lName = splitF[1];

                    People people = new People(fName, lName, age);
                    int lastItem = hashMap.size();

                    // Lisää HashMapiin
                    hashMap.put(lastItem, people.getAll());
                    System.out.println("Aika kulunui HashMapin kanssa = " + System.currentTimeMillis());

                    //Lisää TreeMapiin
                    treeMap.put(lastItem, people.getAll());
                    System.out.println("Aika kulunui TreeMapin kanssa = " + System.currentTimeMillis());


                    //Lisää linkedHashMapiin
                    linkedHashMap.put(lastItem, people.getAll());
                    System.out.println("Aika kulunui LinkedHashMapin kanssa = " + System.currentTimeMillis());

                    // Joka on pienempi

                    System.out.println("Hyvä, kiitos paljon kaikkista =) ");
                } else if (num == 2) {
                    if(hashMap.size() == 0) {
                        System.out.println("HashMap ja muut myös ovat tyhjä");
                    } else {
                        for (int i = 0; i < hashMap.size(); i++) {
                            System.out.println(hashMap.get(i));
                        }

                    }

                } else if (num == 3) {
                    bool = false;
                }


            } catch (Exception e) {
                System.out.println("Error =(");;
            }




        }



    }

}
