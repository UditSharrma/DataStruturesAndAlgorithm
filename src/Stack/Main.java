package Stack;

import java.util.Queue;

public class Main{
    public static void main(String[] args) throws Exception {
        CustomQueue queue =new CustomQueue(5);

        queue.insert(34);
        queue.insert(34);
        queue.insert(314);
        queue.insert(14);
        queue.insert(3422);
        queue.Display();
        queue.remove();
        queue.Display();
        System.out.println(queue.front());


















    }
}
