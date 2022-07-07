package com.example.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao orderDao;
    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
    System.out.println("service call dao");
        return orderDao.insert(order);
    }
}
