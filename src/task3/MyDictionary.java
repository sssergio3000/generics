package task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<K, V> {
    HashMap<K, V> map = new HashMap<>();
    int counter = 0;

    public void add(K parObj1, V parObj2) {
        map.put(parObj1, parObj2);
        counter++;
    }

    public V getByIndex(K parObj) {
        return map.get(parObj);
    }
    public int getCounter(){
        return counter;
    }

}
