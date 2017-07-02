package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.Serializable;

/**
 * Created by xiangyang on 2017/7/2.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private String address;

    private String phoneNum;

    private File file;
}
