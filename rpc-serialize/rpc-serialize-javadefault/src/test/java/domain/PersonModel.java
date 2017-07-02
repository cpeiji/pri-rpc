package domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by xiangyang on 2017/7/2.
 */
@Data
public class PersonModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private String address;

    private String phoneNum;
}
