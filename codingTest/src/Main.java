import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "try hello world  ";
        String[] split = s.split(" ", -1);
        System.out.println(Arrays.toString(split));
    }
}