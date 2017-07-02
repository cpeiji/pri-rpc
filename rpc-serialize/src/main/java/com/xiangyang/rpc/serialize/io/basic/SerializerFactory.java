package com.xiangyang.rpc.serialize.io.basic;

import com.xiangyang.rpc.serialize.io.javadefault.JavaSerializer;
import com.xiangyang.rpc.serialize.io.json.JsonSerializer;

import java.util.HashMap;

/**
 * Created by xiangyang on 2017/7/2.
 */
public class SerializerFactory {

    private static HashMap staticSerializerMap;

    static{
        staticSerializerMap = new HashMap();
        staticSerializerMap.put(JavaSerializer.class,new JavaSerializer());
        staticSerializerMap.put(JsonSerializer.class,new JsonSerializer());
    }

    public Serializer getSerializer(Class cls){
        Serializer serializer;
        serializer = (Serializer) staticSerializerMap.get(cls);

        return serializer;
    }
}
