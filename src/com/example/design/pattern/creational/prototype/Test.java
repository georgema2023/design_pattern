package com.example.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("content");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name "+i);
            mailTemp.setAddress("address "+i);
            mailTemp.setContent("content "+i);
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.sendMail(mail);

    }
}
