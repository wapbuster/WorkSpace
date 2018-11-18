package com.indus.training.pack;

public class B extends Thread {

    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
            Thread.currentThread().setPriority(9);
            System.out.println(Thread.currentThread().getPriority());

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}
