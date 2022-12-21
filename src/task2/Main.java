package task2;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<>();
        ml.add(3);
//        ml.add("list");

        ml.add(3);
        ml.add(6);
        ml.add(7);
        ml.add(3);
        ml.add(0);
        ml.add(3);
        ml.add(2);

        System.out.println("Value of the record with index 3:" + ml.getByIndex(3));
        System.out.println("Total quantity of elements in collection: " + ml.getTotalElemNum());

    }
}
