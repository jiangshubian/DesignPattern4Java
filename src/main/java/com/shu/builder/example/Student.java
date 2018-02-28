package com.shu.builder.example;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2018-02-28 23:37
 * @Version: 1.0.0
 */
public class Student {

    private int id;
    private String name;
    private String passwd;
    private String sex;
    private String address;

    private Student() {
    }

    private Student(Student target) {
        this.id = target.id;
        this.name = target.name;
        this.passwd = target.passwd;
        this.sex = target.sex;
        this.address = target.address;
    }

    public static class Builder {
        Student target;

        public Builder() {
            target = new Student();
        }

        public Builder id(int id) {
            this.target.id = id;
            return this;
        }

        public Builder name(String name) {
            this.target.name = name;
            return this;
        }

        public Builder passwd(String passwd) {
            this.target.passwd = passwd;
            return this;
        }

        public Student build() {
            return new Student(this.target);
        }
    }

}
