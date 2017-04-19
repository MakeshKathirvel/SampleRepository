package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by makeshk.kathirvel on 4/18/2017.
 */
public class SetImplementation {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<String>();
        LinkedHashSet<String> set1 = new LinkedHashSet<String>();
        set.add("Makesh");
        set.add("Ashok");
        set.add("Guru");
        set.add("Makesh");
        set.add("");
        set.add("Ranjana");
        set.add(null);
        set.add(null);

        set.remove("MM");
        Iterator itr = set.iterator();
        System.out.print("HashSet Elements");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        set1.add("");
        set1.add("Srini");
        set1.add("Test");
        set1.add(null);
        set1.add(null);
        System.out.println();
        System.out.println("LinkedHashSet Elements");
        for(String obj : set1){
            System.out.println(obj);
        }

        TreeSet<String> set2 =new TreeSet<String>();
        set2.add("Makesh");
        set2.add("Guru");
        set2.add("Ashok");
        System.out.println("Treeset Elements");
        for(String obj : set2)
            System.out.println(obj);
    }
}
