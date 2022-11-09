package Questions;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(55);
        q.enqueue(80);
        q.enqueue(96);
        q.dequeue();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        q.show();
    }
}
