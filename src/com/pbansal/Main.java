package com.pbansal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(1);
        numbers.print();
        


    }
}
