package BT_linkedlist;

public class LinkerList<E> {
    private Node head;
    private int numNodes;

    public LinkerList() {

    }

    public LinkerList(E data) {
        head = new Node(data);
        numNodes++;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public Node getHead() {
        return head;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder.getData();
    }

    public boolean remove1(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return getNumNodes();
    }

    public boolean contains(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get(int i){
        Node temp = head;
        for (int j = 0; j < i; j++){
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public E getFirst(){
        return (E)head.data;
    }

    public E getLast(){
        Node temp = head;
        for (int j = 1; j < numNodes; j++){
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public void clear() {
        head = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
