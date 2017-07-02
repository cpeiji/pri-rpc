package com.xiangyang.rpc.serialize.io.javadefault;

import com.xiangyang.rpc.serialize.io.basic.Deserializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Created by xiangyang on 2017/7/2.
 */
public class JavaDeserializer implements Deserializer {


    public Object readObject(InputStream in) throws IOException,ClassNotFoundException{
        ObjectInputStream objIn = new ObjectInputStream(in);
        return objIn.readObject();
    }
}
