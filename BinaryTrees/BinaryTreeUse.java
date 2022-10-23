package BinaryTrees;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.println("Enter Root Data : ");
        rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String toBePrinted = root.data + " ";
        if(root.left!=null){
            toBePrinted += "L: "+ root.left.data + ", ";
        }
        if(root.right!=null){
            toBePrinted += "R: " + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s =new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        System.out.println("Enter Root = ");
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front;
            try{
                front = pendingNodes.dequeue();
            }catch(QueueEmptyException e){
                return null;
            }

            System.out.println("Enter left child of "+ front.data);
            int leftChild = s.nextInt();
            if(leftChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left=child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = s.nextInt();
            if(rightChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right=child;
            }
        }
        return root;
    }

    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root== null){
            return 0;
        }
        int ans=1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);
        return ans;
    }

    public static void inOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    //SEARCH NODE IN BST
    public  static boolean searchInBST(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        else if(root.data>k){
            return searchInBST(root.left, k);
        }
        else{
            return searchInBST(root.right, k);
        }
    }

    public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data<k1){
            printBetweenK1K2(root.right, k1, k2);
        }else if(root.data>k1){
            printBetweenK1K2(root.left, k1, k2);
        }else{
            System.out.println(root.data);
            printBetweenK1K2(root.right, k1, k2);
        }
    }

    //Check BST-1
    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        int leftMax=maximum(root.left);
        int rightMin=minimum(root.right);
        if(root.data<=leftMax){
            return false;
        }
        if(root.data>rightMin){
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST= isBST(root.right);
        if(isLeftBST && isRightBST){
            return true;
        }else{
            return false;
        }
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.min(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        BinaryTreeNode<Integer> root = takeInput(s);

          BinaryTreeNode<Integer> root = takeInputLevelWise();
          printTree(root);
          System.out.println(searchInBST(root, 3));

//        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
//        root.left=node1;
//        BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
//        root.right=node2;
    }
}
