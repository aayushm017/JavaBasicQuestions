//Recursion FACTORIAL
/*
public class Recursion {
    public static int fact(int n){
        if(n==0) { //base case without this there will be error..
            return 1;
        }
        int smallAns=fact(n-1);
        return n*smallAns;
    }

    public static void main(String[] args) {
        int n=3;
        int result=fact(n);
        System.out.println(result);
    }
}
*/

//Sum of all natural numbers in recursion
/*
class Recursion{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(sum(n));
    }
}
*/

// Power
/*
class Recursion{
    public static int power(int x, int n){
        if(x==0 && n==0)
            return 0;
        if(x==0)
            return 0;
        if(n==0)
            return 1;

        int smallAns=power(x, n/2);
        if(n%2==0){
            return smallAns*smallAns;
        }else{
            return x*smallAns*smallAns;
        }
    }

    public static void main(String[] args) {
//        int x=2, n=3;
        int pow=power(2, 3);
        System.out.println(pow);
    }
}
*/

//Print numbers
/*
class Recursion{
    public static void print(int n){
        if(n==1){
            System.out.print(n+ " ");
        }else{
            print(n-1);
            System.out.print(n +" ");
        }
    }

    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}
*/


// Count the number of Words
/*
class Recursion{
    public static int count(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns=count(n/10);
        return smallAns+1;
    }
        public static void main(String[] args) {
        int n=10344543;
        int result= count(n);
        System.out.println(result);
    }
}
*/

// Fibonacci Series
/*
class  Recursion{
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int ans=fibo(4);
        System.out.println(ans);
    }
}
*/

//Binary search via Recursion
/*
class Recursion{
    public static int search(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,78};
        int target=78;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
*/

//Natural number in reverse order
/*
class Recursion{
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){   //TC O(n) //SC O(n)
        if(n==0) {
            return;
        }
        System.out.println(n);  // first print in reverse order..
        fun(n-1);
        System.out.println(n);  // after execution of the variables then print linearly after a recursive call
    }
}
*/

//Sum of digits
/*
class Recursion{
    public static int digits(int n){
       if(n==0)
           return 0;
       else
        return digits(n/10)+ (n%10);
    }

    public static void main(String[] args) {
        int n=8798;
        int sum=digits(n);
        System.out.println(sum);
    }
}
*/

//Product of the digits
/*
class Recursion{
    public static int digits(int n){
        if(n%10==n)
            return n;
        else
            return digits(n/10)* (n%10);
    }

    public static void main(String[] args) {
        int n=3330;       //0
        int pro=digits(n);
        System.out.println(pro);
    }
}
*/


// TODO: Reverse a number
/*
class Recursion{
    static int sum=0;
    public static void rev1(int n){
         if(n==0)
             return;
         int rem=n%10;
         sum= sum * 10 + rem;
         rev1(n/10);
    }

    public static void main(String[] args) {
        rev1(4321);
        System.out.println(sum);
    }
}
*/

//Count Zeros in a number
/*
class Recursion{
    public static void main(String[] args) {
        System.out.println(count(3006759));
    }
    public static int count(int n){
        return helper(n, 0);
    }
    //TODO: special pattern, how to pass a number to above calls
    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
*/

//Check if the array is sorted or not
/*
class Recursion{
    public static void main(String[] args) {
        int arr[]={1,2,3,5,16,8};
        System.out.println(sorted(arr, 0));
    }
    public static boolean sorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
// return (arr[index]< arr[index+1])
// return sorted(arr, index+1);
*/


//TODO: Search index of an Array (Linear Search) by different methods:-
/*
import java.util.*;
class Recursion{
    public static boolean find(int arr[], int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    // searching from the start
    public static int findIndex(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    // searching from the end index
    public static int findIndexFromEnd(int arr[], int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndexFromEnd(arr, target, index-1);
    }

    //TODO: via ArrayList

    static ArrayList<Integer> findAllIndex(int arr[], int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    // return the list, dont take it as arguments
    static ArrayList<Integer> findAllIndex2(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain the answer from that function call
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,4,4,5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexFromEnd(arr, 4, arr.length - 1));
        //ArrayList at main
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));
    }
}
*/

// TODO: Pattern questions(2 types)
/*
class Recursion{
    public static void main(String[] args) {
        triangle2(4,0);
//        triangle(8,0);

    }
    public static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }
    }


    *
    **
    ***
    ****
    public static void triangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle2(r, c+1);
            System.out.print("*");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
}
*/

/*
import java.util.Arrays;

//Bubble Sort in Recursion
class Recursion{
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr[], int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }else {
                bubble(arr, r, c + 1);
            }
        }else{
            bubble(arr,r-1, 0);
        }
    }
}
*/

/*
//TODO: Selection Sort
import java.util.Arrays;

class Recursion {
    public static void selection(int arr[], int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,3,2,1};
        selection(arr,arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
*/

//TODO: MergeSort in Recursion

/*
import java.util.Arrays;

class Recursion{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix=new int[first.length + second.length];

        int i =0;
        int j =0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
*/

/* TODO: Merge Sort in place

import java.util.Arrays;

class Recursion{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int arr[], int s, int e){
        if(e-s==1){
            return;
        }

        int mid=(s+e)/2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix=new int[e-s];

        int i =s;
        int j =m;
        int k=0;

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        //copy the remaining elements
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0; l < mix.length; l++){
            arr[s+l]=mix[l];
        }
    }
}
*/

/* TODO: QUICK SORT

import java.util.*;

class Recursion{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int nums[], int low, int high){
        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while(s <= e){

            //also a reason why if its already sorted it will swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        //now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
*/

/* TODO: STRINGS VIA RECURSION

// Skip a charecter

class Recursion{
    public static void main(String[] args) {
        skip("","bachha");
        System.out.println(skipApple("bachha"));
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        if(ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch=up.charAt(0);

        if(ch=='a'){
            return skipApple(up.substring(1));
        }else{
            return ch+skipApple(up.substring(1));
        }
    }
}
*/

/* Subsequences

class Recursion{
    public static void main(String[] args) {
        subseq("", "abc");
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
*/













