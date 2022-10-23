package Queue;

public class QueueUse {
    public static void main(String[] args) {
//        QueueUsingArray queue=new QueueUsingArray(2);
        QueueUsingLL<Integer> queue=new QueueUsingLL<>();
        for(int i=1; i<=5; i++){
//            try {
//                queue.enqueue(i);
//            } catch (QueueFullException e) {
//
//            }
            queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}
