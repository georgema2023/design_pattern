package com.example.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();
    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null){
            manager = new Manager(department);
            manager.setContent(department+" report");
            EMPLOYEE_MAP.put(department,manager);
      System.out.println("create manager: "+department);
        }
        return manager;
    }
}
