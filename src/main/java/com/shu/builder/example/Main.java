package com.shu.builder.example;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2018-02-28 23:45
 * @Version: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Person p = Person.builder().name("亚当").age(10).build();
        System.out.println(p);

        Student s = new Student.Builder().id(1).name("夏娃").passwd("11").build();
        System.out.println(s);
    }
}
