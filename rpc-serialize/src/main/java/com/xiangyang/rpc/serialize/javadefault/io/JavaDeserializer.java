package com.xiangyang.rpc.serialize.javadefault.io;

import com.xiangyang.rpc.serialize.basic.io.Deserializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
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
