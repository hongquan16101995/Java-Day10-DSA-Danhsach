package BT_mylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        size++;
        for (int i = DEFAULT_CAPACITY-1; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = e;
    }

    public void add1(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E remove(int index) {
        E e = (E) elements[index];

        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int mincapacity) {
        this.size = mincapacity;
    }

    public E get(int i) {
        E e = null;
        for (int j = 0; j < size; j++) {
            if (i == j)
                e = (E) elements[j];
        }
        return e;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }

    public boolean add2(E e) {
        if (size == elements.length) {
            size = size++;
            elements[size++] = e;
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            System.out.print((E)elements[i] + "\t");
        }
    }
}