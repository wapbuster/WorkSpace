package com.indus.training.pack;

public class A {

    public static void main(String[] args)
    {
        //int n = 8; // Number of threads
        for (int i=0; i<8; i++)
        {
            B object = new B();
            object.start();
        }
    }
}



