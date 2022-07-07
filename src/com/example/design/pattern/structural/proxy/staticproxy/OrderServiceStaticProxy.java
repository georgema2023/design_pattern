package com.example.design.pattern.structural.proxy.staticproxy;

import com.example.design.pattern.structural.proxy.IOrderService;
import com.example.design.pattern.structural.proxy.Order;
import com.example.design.pattern.structural.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {
    private IOrderService orderService;
    public int saveOrder(Order order){
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
    afterMethod();
        return result;
    }

    private void beforeMethod(Order order){

        int userId = order.getUserId();
        int dbRouter = userId%2;
        System.out.println("db "+dbRouter);
        System.out.println("before");
    }
    private void afterMethod(){
    System.out.println("after");
    }
}
