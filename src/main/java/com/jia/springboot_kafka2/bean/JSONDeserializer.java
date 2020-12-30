package com.jia.springboot_kafka2.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class JSONDeserializer implements Deserializer<JSONObject> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public JSONObject deserialize(String s, byte[] bytes) {
        return JSON.parseObject(bytes,JSONObject.class);
    }

    @Override
    public void close() {

    }
}
