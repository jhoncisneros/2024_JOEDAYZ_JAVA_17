package org.example;

public class MyAutoCloseable implements AutoCloseable{

    private final int num;

    public MyAutoCloseable(int num) {
        this.num = num;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing..." + this.num);
    }
}
