import java.util.ArrayList;
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

    public ArrayList<Integer> findDifference() {
        ArrayList<Integer> newA = new ArrayList<Integer>();
        ArrayList<Integer> newB = new ArrayList<Integer>();

        for (int i = 0; i < this.a.length; i++) {
            newA.add(this.a[i]);
        }
        for (int i = 0; i < this.b.length; i++) {
            newB.add(this.b[i]);
        }

        newA.removeAll(newB);

        return newA;

    }

}

