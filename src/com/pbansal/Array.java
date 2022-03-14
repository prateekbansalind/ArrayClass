package com.pbansal;

import java.util.Arrays;

public class Array {
    // private field of an integer array called items
    private int[] items;
    private int count;

    // Constructor - this constructor takes length of an array as an argument and create an array of given length.
    public Array(int length) {
        this.items = new int[length];
    }

    // Method to print the elements of the array
    public void print(){
        for (int i = 0; i < count; i++)
        System.out.println(items[i]);
    }

    // insert an element to the array
    public void insert(int item){
        // validate the size of an array
        if(items.length == count){


        // Create a new array in case if we want to add more elements
        int[] newItems = new int[count * 2];

        // copy all the elements from the existing array items to the new list newItems.
        for (int i = 0; i < count; i++)
            newItems[i] = items[i];

        // set items to this new array
        items = newItems;}

        items[count++] = item;
    }

    // remove method
    public void removeAt(int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    // search index
    public int indexOf(int item){
        // if we find it, return index
        // Otherwise, return -1
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
}
