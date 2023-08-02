package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedListIface {

    private Node<T> head = null;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public void add(Object data) {
        Node newnode = new Node(data);
        if (this.head == null) {
            this.head = newnode;
        } else {
            Node<T> temp = head;
            while (temp.hasNext()) {
                temp = temp.getNext();
            }

            temp.setNext(newnode);
        }
       @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            //add Head
            sb.append("head -> ");
            if (head != null) {
                //loop through the list and print each data
                Node<T> temp = head;
                while (temp.hasNext()) {
                    sb.append("[" + temp.getData() + "] ->");
                    temp = temp.getNext();
                }
                while (temp != null) ; // && temp.hasNext());
            }
            sb.append("NULL");
            return sb.toString();
        }
    }



    public void remove(int index) throws IndexOutOfBoundsException {

    }

    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    public boolean contains(Object data) {
        return (this.find(data) != -1);
    }

    public int find(Object data) {
        if (this.isEmpty()) return -1;
        int found = -1;
        Node<T> temp = head;
        do {
            found++;
            if (temp.getData().equals(data)) break;
                temp = temp.getNext();
        } while (temp != null);

        return found;
    }

    public int size() {
        if (this.isEmpty()) return 0;
        int n = 0;
        Node<T> temp = head;
        do{
            n++;
            temp = temp.getNext();
        } while (temp != null);
        return n;
    }

    public SinglyLinkedList copy() {
        return null;
    }

    public void sort(Comparator comparator) {

    }
}
