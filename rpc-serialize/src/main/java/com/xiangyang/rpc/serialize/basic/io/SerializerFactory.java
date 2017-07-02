package com.xiangyang.rpc.serialize.basic.io;

import com.xiangyang.rpc.serialize.javadefault.io.JavaSerializer;

import java.util.HashMap;

/**
 * Created by xiangyang on 2017/7/2.
 */
public class SerializerFactory {

    private static HashMap staticSerializerMap;

    static{
        staticSerializerMap = new HashMap();
        staticSerializerMap.put(JavaSerializer.class,new JavaSerializer());
    }

    public Serializer getSerializer(Class cls){
        Serializer serializer;
        serializer = (Serializer) staticSerializerMap.get(cls);

        return serializer;
    }
}
