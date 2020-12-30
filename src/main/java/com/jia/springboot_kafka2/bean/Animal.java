package com.jia.springboot_kafka2.bean;

import java.io.Serializable;

public class Animal  implements Serializable {

    private  String type;

    private  String age;

    public Animal(String type, String age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
