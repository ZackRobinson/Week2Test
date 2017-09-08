package com.example.zack.week2test;

/**
 * Created by Zack on 9/8/2017.
 */

class Singleton {
    private static final Singleton ourInstance = new Singleton();

    static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
