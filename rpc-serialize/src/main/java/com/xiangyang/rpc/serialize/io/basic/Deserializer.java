package com.xiangyang.rpc.serialize.io.basic;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xiangyang on 2017/7/2.
 */
public interface Deserializer {
    Object readObject(InputStream in) throws IOException, ClassNotFoundException;
}
