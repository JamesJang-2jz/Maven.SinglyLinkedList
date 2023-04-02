package com.zipcodewilmington.singlylinkedlist;
import java.util.LinkedList;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    static class Node<T>{ // making static Node class within LinkedList class
        T data;
        Node<T> next;
//        Node prev;
        public Node(T d){
            data = d;
            next = null;
        }
    }
    public SinglyLinkedList() {
        head = null;
        tail = null;
    }
    public Node<T> getHead(){
        return head;
    }
    public Node<T> getNext(){
        return tail;
    }
    /**
     * add: If head/first node doesn't exist, head equals i
     * else if a head exists, newNode goes to end of sequence.
     * tail.next points to the new node
     * tail becomes the newNode, which is the last Node
     */
    public void add(T input){
        Node<T> newNode = new Node<T>(input);
        if (head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    /**
     *
     */
    public void remove(Node j) {
        Node temp;
        Node n = head;
        if (n != null && head == j) {
            head = n.next;
        }
        while (n != null && n.data != j) {
            if (n.next == j) {
                temp = j.next;

            }
        }
    }

    // todo: add, remove, contains, find, size, get, copy and sort methods




}
