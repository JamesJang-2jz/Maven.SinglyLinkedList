package com.zipcodewilmington.singlylinkedlist;
import jdk.nashorn.internal.ir.Node;
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
    /**
     * add: If head/first node doesn't exist, head equals i
     * else if a head exists, the tail.next to next node will point to i
     * tail will also equal i
     */
    public void add(int i){
        if (head == null){
            head = i;
            tail = i;
        } else {
            tail.next = i;
            tail = i;
        }
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
