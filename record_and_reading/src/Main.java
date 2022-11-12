import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("text.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hellooo");
            pw.close();

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}