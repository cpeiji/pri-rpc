package com.xiangyang.rpc.serialize.io.json;

import com.alibaba.fastjson.JSONObject;
import com.xiangyang.rpc.serialize.io.basic.Serializer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by xiangyang on 2017/7/2.
 */
public class JsonSerializer implements Serializer{
    public final static String CHARSET= "UTF-8";

    public void writeObject(Object obj, OutputStream out) throws IOException {
        String objStr = JSONObject.toJSONString(obj);
        out.write(objStr.getBytes(CHARSET));
        out.close();
    }
}
