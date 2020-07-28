package BT_linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkerList = new LinkedList<>(1);
        linkerList.add(1,2);
        linkerList.add(2,3);
        linkerList.add(3,4);
        linkerList.add(4,5);


        System.out.println("In List: ");
        linkerList.printList();
        System.out.println("Trả về phần tử thứ 2: ");
        System.out.println(linkerList.remove(2));
        linkerList.addFirst(10);
        linkerList.addLast(11);
        linkerList.add(2, 11);
        System.out.println("In List sau khi thêm: ");
        linkerList.printList();
        System.out.println("Kiểm tra phần tử có hay khong: ");
        System.out.println(linkerList.contains(12));
        System.out.println("Trả về vị trí đầu tiên của phần tử: ");
        System.out.println(linkerList.indexOf(11));
        System.out.println("Trả về phần tử có hay không và xóa vị trí đầu tiên: ");
        System.out.println(linkerList.remove1(11));
        System.out.println("In List sau khi xóa: ");
        linkerList.printList();
        System.out.println("Trả về các phần tử: ");
        System.out.println(linkerList.get(2));
        System.out.println(linkerList.getFirst());
        System.out.println(linkerList.getLast());
    }
}
