package ir.maktabsharif.q1;

import java.util.Iterator;
import java.util.List;

public abstract class MyLinkedList<T> implements List<T> {

    public Node<T> head;
    private int length = 0;

    MyLinkedList() {
        this.head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
        //first I wanted to write this
        // return head == null ? true : false
        // then I realized head == null returns boolean anyway, so I simplified it in that way!
    }

    @Override
    public boolean add(T element) {
        Node<T> temp = new Node<>(element);
        if (isEmpty()) {
            head = temp;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
        length++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index > length + 1) {
            System.out.println("The position is unavailable in the List");
            return;
        }
        if (index == 1) {
            Node<T> temp = head;
            head = new Node<>(element);
            head.next = temp;
            return;
        }
        Node<T> temp = head;
        Node<T> prev = new Node<>(null);
        while (index - 1 > 0) {
            prev = temp;
            temp = temp.next;
            index--;
        }
        prev.next = new Node<>(element);
        prev.next.next = temp;
    }

    @Override
    public boolean remove(Object element) {
        Node<T> prev = new Node<>(null);
        prev.next = head;
        Node<T> next = head.next;
        Node<T> temp = head;
        boolean found = false;
        if (head.element == element) {
            head = head.next;
            found = true;
        }
        while (temp.next != null) {
            if (String.valueOf(temp.element).equals(element)) {
                prev.next = next;
                found = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if (!found && String.valueOf(temp.element).equals(String.valueOf(element))) {
            prev.next = null;
            found = true;
        }
        if (found) {
            length--;
        } else {
            System.out.println("Your given value is not in the list");
        }

        return found;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= length) {
            System.out.println("The index is unavailable in the List");
            return null;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> temp = head;
            Node<T> prev = null;
            for (int i = 0; i < index; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
        length--;
        return null;
    }

    @Override
    public int indexOf(Object element) {
        Node<T> temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.element.equals(element)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
