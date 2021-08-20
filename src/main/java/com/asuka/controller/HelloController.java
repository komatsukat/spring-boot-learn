package com.asuka.controller;

import com.asuka.model.Car;
import com.asuka.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：hello 接口，
 * 通过 mvn spring-boot:run 启动，然后在浏览器输入 http://localhost:8080/hello 进行访问。
 * 注意：通过 mvn spring-boot:run 命令启动时，项目中只能存在一个main方法才行。
 *
 * @RestController 告诉spring，这个类一个Controller，通过@RequestMapping路由到的方法返回给浏览器的结果是字符串。
 * @EnableAutoConfiguration 这个注解会告诉Spring Boot，让它根据在pom中依赖的starter自动配置Spring，我们在pom里依赖了
 * spring-boot-starter-web 这个starter，这个starter中又依赖了Tomcat和Spring MVC，因此Spring Boot会认为我开发的是一个web应用，
 * 然后进行相应的设置。
 *
 * @author chenpeng
 * @date 2021-05-01 10:31 AM
 */
@Slf4j
@RestController
//@EnableAutoConfiguration
public class HelloController {

    @Autowired
    private Car car;

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }

    /*
    salarys:
    - 1000.98
    - 999.99
  pet:
    name: 小黑猫
    weight: 10.23
  allPets:
    狗狗: [{name: 黄狗,weight: 22.22},{name: 黑狗,weight: 33.33}]
    猫猫:
      - {name: 白猫,weight: 11.11}
      - {name: 花猫}
     */

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String hello() {
        log.info("hello word");
        return "hello world!";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }*/
}
