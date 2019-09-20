package com.bocd.model;

/**
 * @author fuwc
 * @version 1.0, 2019/9/18
 */
public class Person {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}