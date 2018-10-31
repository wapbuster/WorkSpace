package com.indus.training.pack;

public class A {

    public int i; // public be default
    protected int j; // private to com.indus.training.pack.A


    public void setij(int x, int y) {
        i = x;
        j = y;
    }

    public void add(int... row) {
        int sum = 0;

        for (int i=0 ; i < row.length; i++) {

            sum = sum + row[i];

        }
        System.out.println(sum);


    }
}
