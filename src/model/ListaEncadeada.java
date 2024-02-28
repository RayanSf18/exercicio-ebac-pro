package model;

public class ListaEncadeada {

    private Node head;
    private Node tail;
    private int size;

    public ListaEncadeada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(Node node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Node pop() {
        if (isEmpty()) {
            return null;
        }
        Node removedNode = tail;
        if (size == 1) {
            head = tail = null;
        } else {
            Node previous = head;
            while (previous.next != tail) {
                previous = previous.next;
            }
            tail = previous;
            tail.next = null;
        }
        size--;
        return removedNode;
    }

    public void insert(int index, Node node) {
        if (isEmpty() || index == size) {
            push(node);
            return;
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            node.next = previous.next;
            previous.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = head.next;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            previous.next = previous.next.next;
            if (index == size - 1) {
                tail = previous;
            }
        }
        size--;
    }

    public Node elementAt(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

}