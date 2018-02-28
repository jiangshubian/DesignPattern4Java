package com.shu.builder.example;

/**
 *
 * 构建者简单类型
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2018-02-28 23:24
 * @Version: 1.0.0
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
    }

    public static Builders builder() {
        return new Builders();
    }

    public static class Builders {
        private String name;
        private int age;

        public Builders name(String name) {
            this.name = name;
            return this;
        }

        public Builders age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
