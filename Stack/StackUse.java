package Stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray();  //here User will define the size of an Array
        int arr[]={5,6,7,1,9};  //printing double capacity 2 times becoz the data size is 2 then it is doubles to 4 then again it has to double to 8 becoz total number of arr length is 5

        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
//    stack.data[1]=100;
        stack.push(10);
//        System.out.println(stack.top());
        stack.pop();
        stack.size();
//        System.out.println(stack.isEmpty());
    }
}
