package com.xiangyang.rpc.serialize.io.basic;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by xiangyang on 2017/7/1.
 */
public interface Serializer {

    void writeObject(Object obj, OutputStream out) throws IOException;
}
