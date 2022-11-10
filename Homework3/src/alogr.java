
import java.util.ArrayList;
import java.util.List;

public class alogr {
    public List<Integer> First(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        return list;
    }
    public List<Colors> Sec(){
        List<Colors> colors = Colors_all();
        return colors;
    }
    private static List<Colors> Colors_all() {
       return List.of(
                new Colors("Red"),
                new Colors("Blue"),
                new Colors("Green"),
                new Colors("Yellow"),
                new Colors("Black")
        );
    }
}
