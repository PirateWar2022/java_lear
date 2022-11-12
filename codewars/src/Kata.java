import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    private int[] a;
    private int[] b;

    public Kata(int[] a, int[] b){
        this.a = a;
        this.b = b;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int[] getB() {
        return b;
    }

    public void setB(int[] b) {
        this.b = b;
    }

    public int[] findDifference() {
        List<Integer> newA = new ArrayList<Integer>();
        List<Integer> newB = new ArrayList<Integer>();

        newA = clone(this.a);

    }

}

