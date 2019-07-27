package com.coursera.algorithms.part1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        QuickFind uf =new QuickFind(10);
        uf.union(3,4);
        uf.union(5,6);
        uf.union(3,8);
        uf.union(4,9);


        System.out.println(uf.connected(2,6));
        System.out.println(uf.connected(8,9));
        System.out.println(uf.connected(6,3));
       uf.print();

    }
}
