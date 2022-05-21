import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> posIntList = new ArrayList<>();
        for (int a : intList) {
            if (a > 0) posIntList.add(a);
        }
        List<Integer> evenIntList = new ArrayList<>();
        for (int b : posIntList) {
            if (b % 2 == 0) evenIntList.add(b);
        }
        Collections.sort(evenIntList);
        for (int c : evenIntList) {
            System.out.println(c);
        }
    }

}


