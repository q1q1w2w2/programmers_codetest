import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");

        System.out.println(queue.poll()); // 큐가 비어있을 때 null
        System.out.println(queue.remove()); // 큐가 비어있을 때 예외발생

        System.out.println("queue = " + queue);
    }
}