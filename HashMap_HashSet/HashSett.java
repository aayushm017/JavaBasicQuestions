package HashMap_HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    public static void main(String[] args) {
        //Creating
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size
        System.out.println("Size of set is : " + set.size());

        //Print elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Search - contains
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set doesn't contains 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We deleted 1");
        }
    }
}
