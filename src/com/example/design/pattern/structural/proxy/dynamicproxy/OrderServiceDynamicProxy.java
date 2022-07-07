package com.example.design.pattern.structural.proxy.dynamicproxy;

import com.example.design.pattern.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;
    public OrderServiceDynamicProxy(Object target){
        this.target = target;
    }
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }
    private void beforeMethod(Object obj){
        int userId = 0;
    System.out.println("before");
    if (obj instanceof Order){
        Order order = (Order) obj;
    }
    int dbRouter = userId%2;
    System.out.println("db "+dbRouter);
    }

    private void afterMethod(){
        System.out.println("after");
    }
}
