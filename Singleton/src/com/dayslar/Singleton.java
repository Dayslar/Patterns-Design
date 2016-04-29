package com.dayslar;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Create instance");
    }

    public static synchronized Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();

        System.out.println(instance);
        return instance;
    }
}
