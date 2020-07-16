package linkerlist_doc;

public class Node<E> {
    E element;
    Node<E> next;
    Node<String> head = null;
    Node<String> tail = null;
    int size;

    public Node(E e) {
        this.element = e;
    }

    public void addFirst(E e) {
        Node newNode = new Node<>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // The new node is the only node in list
            tail = head;
    }

    public void addLast(E e) {
        Node newNode = new Node<>(e); // Create a new node for e

        if (tail == null) {
            head = tail = newNode; // The only node in list
        }
        else {
            tail.next = newNode; // Link the new node with the last node
            tail = tail.next; // tail now points to the last node
        }
        size++; // Increase size
    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e); // Insert first
        else if (index >= size) addLast(e); // Insert last
        else { // Insert in the middle
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) return null; // Nothing to delete
        else {
            Node temp = head; // Keep the first node temporarily
            head = head.next; // Move head to point to next node
            size--; // Reduce size by 1
            if (head == null) tail = null; // List becomes empty
            return (E)temp.element; // Return the deleted element
        }
    }

    public E removeLast() {
        if (size == 0) return null; // Nothing to remove
        else if (size == 1) { // Only one element in the list
            Node temp = head;
            head = tail = null; // list becomes empty
            size = 0;
            return (E)temp.element;
        } else {
            Node current = head;

            for (int i = 0; i < size - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return (E)temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == size - 1) return removeLast(); // Remove last
        else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            size--;
            return (E)current.element;
        }
    }
}
