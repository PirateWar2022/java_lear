import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(21);
        age.add(23);
        age.add(211);
        age.add(2);
        age.add(1);

        int cnt = age.size()-1;
        while (cnt > -1) {
            int last = age.get(cnt);
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if(last < age.get(i)) {
                    last = age.get(i);
                    index = i;
                }
            }
            int tmp = age.get(cnt);
            age.set(cnt, age.get(index));
            age.set(index, tmp);
            cnt--;
        }

        System.out.println(age);

    }
}