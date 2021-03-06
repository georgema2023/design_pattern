package com.example.design.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private final static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){
        if (singleton!=null){
            throw new RuntimeException("constructor reflection is not allowed");
        }
    }
    public static HungrySingleton getInstance(){
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
