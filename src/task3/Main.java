package task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> md = new MyDictionary<>();
        md.add(1,"serg");
        md.add(2,"adasf");
        md.add(3,"thyjtyjg");
        md.add(4,"sdfgfdngjguyuk");
        md.add(5,"serg");
        md.add(6,"zsdvfdfghjgh");
        md.add(7,"serg");
        md.add(8,"serg");
        md.add(9,"dssgerthytj");
        md.add(10,"serg");
        md.add(11,"sdgtfjguk");
        md.add(12,"ertrtnnmjk");



        System.out.println("Value of element number 5: "+md.getByIndex(5));

        System.out.println("Total number of elemens: "+md.getCounter());

    }
}
