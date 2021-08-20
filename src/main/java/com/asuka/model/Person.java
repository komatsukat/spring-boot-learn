package com.asuka.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 描述：
 *
 * @author chenpeng
 * @date 2021-05-01 11:13 PM
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score; // 注意：Map的key必须是英文才行，不然不能正确映射。
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
