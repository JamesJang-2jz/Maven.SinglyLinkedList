package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest{

    SinglyLinkedList<String> list;

    @Before
    public void before(){
        list = new SinglyLinkedList<>();
    }
    @Test
    public void testAdd(){
        // Given
        String expected = "test";
        // When
        list.add(expected);
        list.add("another one");
        // Then
        Assert.assertEquals(expected, list.getHead().data);
        Assert.assertTrue(list.contains(expected));
    }
    @Test
    public void testRemove(){
        // Given
        String expected = "test";
        // When
        list.add(expected);
        list.add("Test2");
        list.remove(expected);
        // Then
        Assert.assertFalse(list.contains(expected));
    }

    @Test
    public void testContains() {
        // Given
        String expected = "test";
        // When
        list.add(expected);
        // Then
        Assert.assertTrue(list.contains(expected));
    }
    @Test
    public void testFind() {
        // Given
        int expected = 1;
        String input = "test";
        // When
        list.add(" ");
        list.add(input);
        int actual = list.find(input);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindEmpty() {
        // Given
        int expected = -1;
        String input = "test";
        // When
        list.add(" ");
        list.add(" ");
        int actual = list.find(input);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        // Given
        String input = "test";
        int expected = 2;
        // When
        list.add(input);
        list.add("dummy");
        int actual = list.size();
        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGet() {
        // Given
        String expected = "test";
        // When
        list.add("another one");
        list.add(expected);
        String actual = list.get(1).getData();
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCopy() {
        // Given
        list.add("dummy1");
        list.add("zipcode");
        list.add("dbz");
        SinglyLinkedList<String> testList = list.copy();
        // When
        // Then
        Assert.assertNotEquals(list.toString(), testList.toString());
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i).getData(), testList.get(i).getData());
        }
    }
    @Test
    public void testSort() {
        // Given
        list.add("dummyString");
        list.add("zipcode");
        list.add("dbz");
        // When
        list.sort();

        // Then
        Assert.assertEquals(list.get(0).getData(), "dummyString");
        Assert.assertEquals(list.get(1).getData(), "zipcode");
        Assert.assertEquals(list.get(2).getData(), "dbz");
    }

}
