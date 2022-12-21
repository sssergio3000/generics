package task2;
import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List <T> list= new ArrayList<>();
    private int totalElemNum = 0;


    public void add(T parObj) {
        list.add(parObj);
        totalElemNum++;
    }

    public T getByIndex(int parIndex) {
        return list.get(parIndex);
    }

    public int getTotalElemNum(){
        return totalElemNum;
    }


}
