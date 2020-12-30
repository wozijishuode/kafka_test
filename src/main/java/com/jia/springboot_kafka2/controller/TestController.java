package com.jia.springboot_kafka2.controller;

import com.alibaba.fastjson.JSONObject;
import com.jia.springboot_kafka2.bean.Animal;
import com.jia.springboot_kafka2.bean.KafkaProducer;
import com.jia.springboot_kafka2.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/send")
public class TestController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @RequestMapping("Objdata")
    public  String  sendata(){

        Animal dog = new Animal("狗", "1");
        Animal mao = new Animal("mao", "1");
        ArrayList<Animal> animals = new ArrayList<>();
        Student zhangsan = new Student("3", "zhangsan",animals);

        animals.add(dog);
        animals.add(mao);
        List<Animal> pents = zhangsan.getPents();
        JSONObject jsonObject = (JSONObject)JSONObject.toJSON(zhangsan);
        String s = kafkaProducer.sendMessage(jsonObject);

        return s;
    }
}
