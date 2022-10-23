package Stack;

public class StackUsingArray {

    private int data[];
    private int topIndex;  //index of the topmost element of the stack, privatised as of no one can modify my stack

    public StackUsingArray(){
        data=new int[2];  //we kept a small size stack becoz we have double capacity of the stack..
        topIndex=-1;  //initial value of the stack
    }

    public StackUsingArray(int size){  //here User will define the size of an Array as in class StackUse.java
        data=new int[size];
        topIndex=-1;  //initial value of the stack
    }

    // O(1) Time complexity
    public int size(){
        return topIndex+1;
    }

    // O(1) Time complexity
    public boolean isEmpty(){
//        if(top==1){
//            return true;
//        }else{
//            return true;
//        }
        return topIndex==-1;
    }

    // O(1) Time complexity
    public void push(int elem) {
        //if stack is full we can throw an Exception
        if(topIndex== data.length-1) {
            //Throw Exception
//            StackFullException e = new StackFullException();  //class is made outside check the folder
//            throw new StackFullException();  //or we can write like this
            doubleCapacity();  //this function will double the capacity
        }
        data[++topIndex]=elem;
    }

    private void doubleCapacity(){
        System.out.println("Double Capacity");
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0; i<temp.length; i++){
            data[i]=temp[i];
        }
    }

    // O(1) Time complexity
    public int top() throws StackEmptyException{
        if(topIndex==-1){
            //Throw stack Empty Exception
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // O(1) Time complexity
    public int pop() throws StackEmptyException{
        if(topIndex==-1){
            //Throw stack Empty Exception
            throw new StackEmptyException();
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;
    }
}
