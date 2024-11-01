import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = new int[a.length];
        IntStream.range(0, a.length).forEach(i -> {
            c[i] = a[i] * b[i];
        });
        System.out.println("c = " + Arrays.toString(c));

        System.out.println(IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum());
    }
}