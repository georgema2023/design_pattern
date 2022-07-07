package com.example.design.pattern.structural.proxy;

public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
    System.out.println("insert successfully");
        return 1;
    }
}
