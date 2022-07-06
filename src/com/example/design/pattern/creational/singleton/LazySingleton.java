package com.example.design.pattern.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;
    private LazySingleton(){
        if (flag){
            flag = false;
        } else {
            throw new RuntimeException("reflection is not allowed");
        }
    }
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
