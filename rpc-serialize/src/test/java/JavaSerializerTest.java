import com.xiangyang.rpc.serialize.io.basic.Serializer;
import com.xiangyang.rpc.serialize.io.basic.SerializerFactory;
import com.xiangyang.rpc.serialize.io.javadefault.JavaDeserializer;
import com.xiangyang.rpc.serialize.io.javadefault.JavaSerializer;
import domain.PersonModel;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by xiangyang on 2017/7/2.
 */
public class JavaSerializerTest {
    SerializerFactory serializerFactory = new SerializerFactory();
    @Test
    public void serializerTest() throws IOException{
        PersonModel personModel = new PersonModel("张三",16,"杭州市","15858888888",new File("/Users/xiangyang/document/car_loan.sql"));
        Serializer serializer = serializerFactory.getSerializer(JavaSerializer.class);
        FileOutputStream fos = new FileOutputStream(new File("/Users/xiangyang/test.txt"));
        serializer.writeObject(personModel,fos);
    }

    @Test
    public void deserializerTest() throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream(new File("/Users/xiangyang/test.txt"));
        JavaDeserializer javaDeserializer = new JavaDeserializer();
        PersonModel personModel = (PersonModel) javaDeserializer.readObject(fis);
        System.out.println(personModel);
    }
}
