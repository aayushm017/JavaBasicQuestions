//Coding Ninja

//Basics of Linked List...
/*
public class LinkedList {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        //System.out.println("n1 "+ n1+ " data "+ n1.data+ " next "+ n1.next);
        n2.next=n3;
//        System.out.println("n2 "+ n2+ " data "+ n2.data+ " next "+ n2.next);
        n3.next=n4;
//        System.out.println("n3 "+ n3+ " data "+ n3.data+ " next "+ n3.next);
//        System.out.println("n4 "+ n4+ " data "+ n4.data+ " next "+ n4.next);
        return n1;
    }

    public static void print(Node<Integer> head){
//        System.out.println("Print "+ head);
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;   //head will carry the address of the next node and above
            // head.data will print the data of the same node
        }
        System.out.println();

//        System.out.println("Main "+ head);
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
    }

    public static void main(String[] args) {
        Node<Integer> head= createLinkedList();
        print(head);

//        Node<Integer> n1=new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
*/

/*Calculate the length of LL

public class LinkedList{
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        //System.out.println("n1 "+ n1+ " data "+ n1.data+ " next "+ n1.next);
        n2.next=n3;
//        System.out.println("n2 "+ n2+ " data "+ n2.data+ " next "+ n2.next);
        n3.next=n4;
//        System.out.println("n3 "+ n3+ " data "+ n3.data+ " next "+ n3.next);
//        System.out.println("n4 "+ n4+ " data "+ n4.data+ " next "+ n4.next);
        return n1;
    }

    public static void print(Node<Integer> head) {
//        System.out.println("Print "+ head);
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;   //head will carry the address of the next node and above
            // head.data will print the data of the same node
        }
        System.out.println();
    }
    public static int length(Node<Integer> head){
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node<Integer> head= createLinkedList();
        print(head);
        System.out.println(length(head));
    }
}
*/

/*LL -- TAKE INPUT*/
/*
import java.util.*;
class LinkedList{
    public static void print(Node<Integer> head) {
//        System.out.println("Print "+ head);
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;   //head will carry the address of the next node and above
            // head.data will print the data of the same node
        }
        System.out.println();
    }
    public static Node<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        System.out.println(data);
        Node<Integer> head=null;
        while(data!=-1){
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head==null){
                //Make this node as head node becoz null tends to the head
                head=currentNode;
            }else{
                Node<Integer> tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                //Now tail will refer to the last node
                //Connect current node after last node
                tail.next=currentNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        print(head);
    }
}

 */