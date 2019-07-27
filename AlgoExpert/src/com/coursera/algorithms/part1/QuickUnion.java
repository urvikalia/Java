package com.coursera.algorithms.part1;


/*
    Better than Quick Find
    It has a lozy approach

 */
public class QuickUnion {

    private int [] id;

    public QuickUnion(int N) {
        this.id = new int[N];
        for(int cnt=0;cnt<id.length;cnt++)
            id[cnt]=cnt;
    }

    public boolean connected(int p,int q)
    {
        return findRoot(p)== findRoot(q);
    }

    public void union(int p, int q)
    {

    }

    public int findRoot(int p)
    {
        int element=p;
        while(id[element]!=element)
            element=id[element];
        return element;
    }

    public static void main(String[] args) {

    }
}
