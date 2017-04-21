package collections;

import java.util.*;

/**
 * Created by makeshk.kathirvel on 4/19/2017.
 */
public class MapImpl {
    public static void main(String args[]){
        HashMap<Integer,String> hs = new HashMap<Integer,String>();
        LinkedHashMap<Integer,String> map= new LinkedHashMap<Integer, String>();
        TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
        hs.put(1,"Makesh");
        hs.put(1,"MS");
        hs.put(2,"Guru");
        hs.put(null,null);
        hs.put(null,"Null");
        hs.put(3,"Guru");
        System.out.println("Elements in HashMap");
        for(Map.Entry s : hs.entrySet()){
            System.out.println(s.getKey()+","+s.getValue());
        }
        map.putAll(hs);
        map.put(1,"Mk");
        System.out.println("Elements in LinkedHashMap");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+","+m.getValue());
        }

        tm.put(1,"MS");
        tm.put(4,"Ashok");
        tm.put(3,"Srini");
        tm.put(2,null);
        tm.put(5,null);
        System.out.println("Elements in TreeMap");
        for(Map.Entry ms : tm.entrySet()){
            System.out.println(ms.getKey()+","+ms.getValue());
        }

    }
}
