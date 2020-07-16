package BT_mylist;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add1(1);
        myList.add1(2);
        myList.add1(3);
        myList.add1(4);
        myList.add1(5);
        myList.print();
        System.out.println("abc: ");
        myList.add(3,10);
        myList.print();
    }
}
