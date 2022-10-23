package Trees;

//TODO: Take input and print using Recursion

//import java.util.Scanner;
//public class TreeUse {
//    public static TreeNode<Integer> takeInput(Scanner s) {
//        int n;
//        System.out.println("Enter Next Node: ");
//        n = s.nextInt();
//        TreeNode<Integer> root=new TreeNode<>(n);
//        System.out.println("Enter the number of children for "+n);
//        int childCount=s.nextInt();
//        for(int i=0; i<childCount; i++){
//            TreeNode<Integer> child=takeInput(s);
//            root.children.add(child);
//        }
//        return root;
//    }
//
//    public static void print(TreeNode<Integer> root) {
//        String s= root.data + ":";
//        for(int i=0; i<root.children.size(); i++){
//            s= s + root.children.get(i).data+",";
//        }
//        System.out.println(s);
//        for(int i=0; i<root.children.size(); i++){
//            print(root.children.get(i));
//        }
//    }


//public static void main(String[] args) {
//            Scanner s = new Scanner(System.in);
//            TreeNode<Integer> root=takeInput(s);
//            print(root);

//        TreeNode<Integer> root=new TreeNode<>(4);
//        TreeNode<Integer> node1=new TreeNode<>(2);
//        TreeNode<Integer> node2=new TreeNode<>(3);
//        TreeNode<Integer> node3=new TreeNode<>(5);
//        TreeNode<Integer> node4=new TreeNode<>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//        System.out.println(root);
//    }
//}


import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;
public class TreeUse {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        TreeNode<Integer> root = takeInput(s);

        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println("Number of Node = "+ numNodes(root));
        System.out.println("Largest Node in the Tree = "+ largest(root));
        printAtK(root, 2);
        preOrder(root);
    }

    public static TreeNode<Integer> takeInput(Scanner s) {
        int n;
        System.out.println("Enter Next Node: ");
        n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter the number of children for " + n);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){  //main code for the tree
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root data = ");  //input first node
        int rootData=s.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        TreeNode<Integer> root=new TreeNode<Integer>(rootData);  //the topmost(root) data which we have to enqueue further
        pendingNodes.enqueue(root);  //insert rootData in a queue(pendingNodes) which will be further dequeued

        while(!pendingNodes.isEmpty()){
            try {
                TreeNode<Integer> frontNode=pendingNodes.dequeue();  //inserted rootData will be dequeued
                System.out.println("Enter num of children of "+ frontNode.data);  //after dequeuing the rootData it will ask for the number of child of the same
                int numChildren=s.nextInt();  //Enter the number of child
                for(int i=0; i<numChildren; i++) {  //from 0 to no. of child
                    System.out.println("Enter "+ (i+1)+ "th child of "+ frontNode.data);  //ith child of frontNode which is dequeued and earlier known as rootData(1st child, 2nd child or etc.)
                    int child=s.nextInt();  //child of the frontNode(rootData) is printed and it will be enqueued further
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);  //Node is being created for the child
                    frontNode.children.add(childNode);  //linking childNode data to the frontNode data
                    pendingNodes.enqueue(childNode); //pending child nodes will again enqueued in the LL Queue
                }
            } catch (QueueEmptyException e) {
                //Shouldn't come here
                return null;
            }
        }
        return root;
    }

    public static int numNodes(TreeNode<Integer> root){  //Number of Nodes present in the TREE
        if(root==null){  //Base case
            return 0;
        }
        int count=1;
        for(int i=0; i<root.children.size(); i++){
            count+=numNodes(root.children.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int ans=root.data;
        for(int i=0; i<root.children.size(); i++){
            int childLargest=largest(root.children.get(i));
            if(childLargest > ans){
                ans=childLargest;
            }
        }
        return ans;
    }

    public static void printAtK(TreeNode<Integer> root, int k) {  //print the depth of the tree means print the 2nd line numbers..
        if(k<0){
            return;
        }
        if(k==0){
            System.out.print(root.data + " ");
            return;
        }
        for(int i=0; i<root.children.size(); i++){
            printAtK(root.children.get(i), k-1);
        }
    }
 
    public static void preOrder(TreeNode<Integer> root){
        System.out.print(root.data + " ");
        for(int i=0; i<root.children.size(); i++){
            preOrder(root.children.get(i));
        }
    }
}