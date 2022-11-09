package Questions;

public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size >= 5;
    }
    public int getSize(){
        return size;
    }

    public void enqueue(int data){
        queue[rear] = data;
        rear++;
        size++;
    }

    public int dequeue(){
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void show(){
        System.out.print("Elements = ");
        for(int  i = 0; i < size; i++){
            System.out.print(queue[front + i] + " ");
        }
        System.out.println();
    }
}
