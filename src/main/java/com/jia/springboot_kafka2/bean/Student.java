package com.jia.springboot_kafka2.bean;

import java.io.Serializable;
import java.util.List;

public class Student  implements Serializable {

    private  String age;

    private  String name;

    private   List<Animal>  pents;

    public Student(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String age, String name, List<Animal> pents) {
        this.age = age;
        this.name = name;
        this.pents = pents;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getPents() {
        return pents;
    }

    public void setPents(List<Animal> pents) {
        this.pents = pents;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", pents=" + pents +
                '}';
    }

    public static void main(String[] args) {

      /*  Animal dog = new Animal("狗", "1");
        Animal mao = new Animal("mao", "1");
        ArrayList<Animal> animals = new ArrayList<>();
        Student zhangsan = new Student("3", "zhangsan",animals);

        animals.add(dog);
        animals.add(mao);
        System.out.println( zhangsan);*/

      Object  s="{\"data\": [{\"code\":\"123456\",\"operation_type\":\"I\",\"module\":\"智慧运营事件\",\"update_time\":\"2020-07-07\"}],\"name\":\"module_base_info\"}\n";

        System.out.println(s);
        System.out.println(s instanceof  String);

    }
}



