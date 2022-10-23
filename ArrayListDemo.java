import java.util.ArrayList;

// ArrayList Basics
/*
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(1);
        arr.add(10); //Adding number in 1st index
        arr.add(20); //Adding number in 2nd index
        arr.add(30); //Adding number in 3rd index
        arr.add(0, 80); //adding 80 in 1st index
        arr.remove(2); //removing the 2nd index and shift the next one to the left(removed position)
//        arr.set(1, 100);
        System.out.println(arr.size());  //evaluating the size of an array(filled index).
        System.out.println(arr.get(1));

        for(int i=0; i<arr.size(); i++){  // here i denotes the index
            System.out.println(arr.get(i));
        }

        // Enhanced for loop; for-each loop
        for(int i:arr){  // for every element i in this ArrayList you can travel with this for loop
            // here i denotes the value of ArrayList element
            // say: for each element i in an Array
            System.out.println(i);
        }
    }
}
*/

//Removing Duplicates from an Array from ArrayList

public class ArrayListDemo {

    public static ArrayList<Integer> ArrayListDemo(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={10, 10, 20,20,30,40, 10};
        ArrayList<Integer> result=ArrayListDemo(arr);

        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}