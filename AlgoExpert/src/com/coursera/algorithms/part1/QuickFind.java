package com.coursera.algorithms.part1;

/**
 * Quick Find - is easy to implement But too slow
 * it uses an eager approach
 * In this case unions are too expensive
 * Take N^2 array accesses to process sequence of N union command on N objects
 * Quadratic algorithms dont scale
 * Quick Find is too slow
 */
public class QuickFind {

    private int [] id;

    public QuickFind(int N) {
        id= new int[N];
        for(int cnt=0;cnt<id.length;cnt++)
        {
            id[cnt]=cnt;
        }
    }

    public boolean connected(int p, int q)
    {
        if(id[p]==id[q])
            return true;
        else
            return false;
    }

    public void union(int p, int q)
    {
        int secValue=id[q];
        int value=id[p];

        for(int cnt=0;cnt<id.length;cnt++)
        {
            if(id[cnt]==secValue)
                id[cnt]=value;
        }
    }

    public void print() {
        System.out.println();
        for(int cnt=0;cnt<id.length;cnt++)
            System.out.print(id[cnt]+ " ");
    }
}
