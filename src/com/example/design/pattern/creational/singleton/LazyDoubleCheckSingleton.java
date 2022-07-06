package com.example.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;
    private LazyDoubleCheckSingleton(){};
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            };
        }
        return lazySingleton;
    }
}
