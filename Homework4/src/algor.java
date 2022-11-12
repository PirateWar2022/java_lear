import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class algor {

    public void File_writer(String name, String gend, Integer age) {
        try (FileWriter writer = new FileWriter("Persons.txt", true)) {
            writer.write(name + " " + gend + " " + age + ", ");

            writer.flush();
        } catch (IOException ex) {
            System.out.println("Something error");
        }
    }

    public String Takeinfo() {
        try (FileReader reader = new FileReader("Persons.txt")) {
            int intValueOfChar;
            String ordinaryString = "";
            while ((intValueOfChar = reader.read()) != -1) {
                ordinaryString += (char) intValueOfChar;
            }
            return ordinaryString;

        } catch (IOException ex) {
            return "Error";
        }
    }

    public ArrayList<Integer> sortingToLists(String this_sorting) {
        // three categories
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> gander = new ArrayList<>();


        String[] new_str = this_sorting.split(" ");
        var nothing = "";
        var new_str2 = "";

        for (int i = 0; i < new_str.length; i++) {
            nothing += new_str[i];
            for (int j = 0; j < 1; j++) {
                String[] ab = nothing.split("_");
                int b = Integer.decode(ab[2]);
                age.add(b);
                names.add(ab[0]);
                nothing = "";
            }

        }
        return age;
    }


}





