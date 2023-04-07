package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {
        T data;
        Node<T> next;

        public Node(T d){
            data = d;
            next = null;
        }

    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
