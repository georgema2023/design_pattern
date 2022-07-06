package com.example.design.pattern.creational.singleton;

public class LazyStaticInnerClassSingleton {
    private static class InnerClass{
        private static LazyStaticInnerClassSingleton singleton = new LazyStaticInnerClassSingleton();
    }
    public static LazyStaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }
}
