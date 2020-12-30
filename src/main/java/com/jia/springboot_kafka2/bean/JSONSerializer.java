package com.jia.springboot_kafka2.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class JSONSerializer implements Serializer<JSONObject> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String s, JSONObject jsonObject) {
        return JSON.toJSONBytes(jsonObject);
    }

    @Override
    public void close() {

    }
}
