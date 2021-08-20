package com.asuka.config;

import com.asuka.model.Car;
import com.asuka.model.Pet;
import com.asuka.model.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 描述：配置类，相当于Spring的Bean.xml
 *
 * @author chenpeng
 * @date 2021-05-01 2:08 PM
 */
//@ConditionalOnBean(name = "tom")
@Import({User.class, Pet.class})
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User user01() {
        return new User("张三", 12, cat());
    }

    @Bean
    public Pet cat() {
        return new Pet();
    }
}
