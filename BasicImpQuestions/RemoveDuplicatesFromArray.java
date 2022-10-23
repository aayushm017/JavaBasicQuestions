package BasicImpQuestions;

import java.util.HashSet;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        //Only Sorted Array
//        int[] a = {1,2,2,3,4,5,5};
//        int[] temp = new int[a.length];
//        int j=0;
//        for(int i=0; i<a.length-1; i++){
//            if(a[i]!=a[i+1]){
//                temp[j]=a[i];
//                j++;
//            }
//        }
//        temp[j] = a[a.length-1];
//
//        for(int i=0; i<temp.length; i++){
//            System.out.print(temp[i] + " ");
//        }

        //remove duplicates from Sorted and Unsorted Array via HashMaps
        int[] a={1,3,2,5,4,8,3,1};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        for(int no:hs){
            System.out.print(no + " ");
        }
    }
}
