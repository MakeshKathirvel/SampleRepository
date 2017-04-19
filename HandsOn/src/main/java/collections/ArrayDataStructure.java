package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by makeshk.kathirvel on 4/18/2017.
 */
public class ArrayDataStructure {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.remove(1);
        arr.add(2);
        arr.remove(0);
        arr.add(2);
        System.out.println("Array Elements" +arr);
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
        }
        for(int obj:arr){
            System.out.println(obj);
        }
        arr2.add(24);
        arr2.addAll(arr);
        Iterator itr1 = arr2.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
