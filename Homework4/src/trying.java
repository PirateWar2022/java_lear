import java.util.ArrayList;

public class trying {
    public static void main(String[] args) {
        String a = "Hello_man_2 Three_two_3";
        ArrayList<Integer> age = new ArrayList<>();

        String[] split_method = a.split(" ");
        String nothing = "";


        for (int i = 0; i < 2; i++) {
            nothing += split_method[i];
            for (int j = 0; j < 1; j++) {
                String[] ab = nothing.split("_");
                int b = Integer.decode(ab[2]);
                age.add(b);
                nothing = "";
              }
            }
        System.out.println(age);

        }




    }

