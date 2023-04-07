package com.zipcodewilmington.singlylinkedlist;
import java.util.LinkedList;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node<T> head;
    public boolean contains(T expected) {
        Node<T> current = head;
        while (current != null){
            if (current.getData().equals(expected)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int find(T input) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.getData().equals(input)) {
                return count;
            }
            current = current.next;
            count++;
        }
        return -1;
    }
    public int size() {
        Node<T> current = head;
        int count = 0;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }
    public Node<T> get(int i) {
        Node<T> current = head;
        int count = 0;
        while (current != null){
            if (count == i){
            return current;
        }
            current = current.next;
            count++;
        }
        return null;
    }
    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> list = new SinglyLinkedList<>(); // instantiate a new Singly
        Node<T> current = head; // new Node field equal to head. current is a Node
        while (current != null){ // while loop while current is not equal to null
            list.add(current.getData()); // iterating thru, add current data from the node into list
            current = current.next; // makes current node index turn into next node
            }
        return list;  // when current node is null (points to nonexist node), return list
    }

    public void sort() {
    }
    public SinglyLinkedList() {
        head = null;
    }
    public Node<T> getHead(){
        return head;
    }
    /**
     * add: If head/first node doesn't exist, head equals i
     * else if a head exists, newNode goes to end of sequence.
     * tail.next points to the new node
     * tail becomes the newNode, which is the last Node
     */
    public void add(T input){
        Node<T> newNode = new Node<>(input);
        if (head == null){
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.setNext(new Node<T>(input));
        }
    }
    public void remove(T j) {
        Node temp;
        Node n = head;
        if (n != null && head == j) {
            head = n.next;
        }
        while (n != null && n.data != j) {
            if (n.next == j) {

            }
        }
    }
    public void setHead(Node<T> head) {
        this.head = head;
    }

}
