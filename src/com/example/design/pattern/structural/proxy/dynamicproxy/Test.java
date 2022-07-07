package com.example.design.pattern.structural.proxy.dynamicproxy;

import com.example.design.pattern.structural.proxy.IOrderService;
import com.example.design.pattern.structural.proxy.Order;
import com.example.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {
  public static void main(String[] args) {
      Order order = new Order();
      order.setUserId(1);
      IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
      orderServiceDynamicProxy.saveOrder(order);
  }
}
