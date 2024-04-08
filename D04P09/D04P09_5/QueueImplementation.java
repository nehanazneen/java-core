package Day4;


import java.util.LinkedList;
import java.util.Queue;

class QueueImplementation {
    public static void main(String[] args) {
                Queue<Integer> queue = new LinkedList<>();

                queue.add(89);
        queue.add(99);
        queue.add(109);
        queue.add(209);
        queue.add(309);

                queue.poll();
        queue.poll();

                System.out.print("Elements in queue: ");
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
    }
}
