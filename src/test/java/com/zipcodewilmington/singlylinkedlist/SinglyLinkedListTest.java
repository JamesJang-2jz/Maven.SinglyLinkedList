package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest{
    @Test
    public void testAdd(){
        // Given
        SinglyLinkedList<Integer> sing = new SinglyLinkedList<>();
        Integer expected = 24;
        // When
        sing.add(expected);
        // Then
        Assert.assertEquals(expected, sing.getHead().data);
        Assert.assertEquals(expected, sing.getNext().data);
    }
    @Test
    public void testRemove(){

    }

}
