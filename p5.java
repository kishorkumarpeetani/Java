import java.util.*;

class p5 {
    public static void main(String args[]) {

        int[] a1 = { 1,5,3,7,2};

        int[] a2 = { 4,2,6,5,10,8 };

        Set<Integer> s = new TreeSet<>();

        for (int i : a1)   s.add(i);

        for (int j : a2)   s.add(j);

        for (int k : s)
            System.out.print(k + " ");

    }
}