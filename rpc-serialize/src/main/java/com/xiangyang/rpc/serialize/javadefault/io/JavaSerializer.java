package com.xiangyang.rpc.serialize.javadefault.io;

import com.xiangyang.rpc.serialize.basic.io.Serializer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by xiangyang on 2017/7/2.
 */
public class JavaSerializer implements Serializer {

    public void writeObject(Object obj, OutputStream out) throws IOException {
        ObjectOutputStream objOut = new ObjectOutputStream(out);//out是输出流的抽象对象
        objOut.writeObject(obj);
        objOut.close();
    }
}
