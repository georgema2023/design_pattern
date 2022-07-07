package com.example.design.pattern.behavioral.chainofresponsibility;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course.getVideo() != null) {
            System.out.println(course.getName() + " has video");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "does not have video");
            return;
        }
    }
}
