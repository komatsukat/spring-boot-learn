package com.asuka.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 描述：车
 *
 * @author chenpeng
 * @date 2021-05-01 3:48 PM
 */
//@Component // 只有Spring容器的组件，才会拥有SpringBoot提供的强大的功能
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String name;
    private String price;

    public Car() {
    }

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
