package com.asuka;

import com.asuka.model.Person;
import com.asuka.model.Pet;
import com.asuka.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * 描述：spring boot启动器
 *
 * @author chenpeng
 * @date 2021-05-01 10:16 AM
 */
@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        /*String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }*/

        /*User user01 = run.getBean("user01", User.class);
        MyConfig myConfig = run.getBean(MyConfig.class);
        User user02 = myConfig.user01();
        User user03 = run.getBean("user01", User.class);

        Pet cat = myConfig.cat();

        System.out.println("用户：" + (user01 == user02));
        System.out.println("用户：" + (user01 == user03));
        System.out.println("宠物：" + (cat == user01.getPet()));
        System.out.println("宠物：" + (cat == user02.getPet()));*/


        /*User user01 = run.getBean("user01", User.class);
        User user = run.getBean("com.asuka.model.User", User.class);
        Pet pet = run.getBean("com.asuka.model.Pet", Pet.class);
        System.out.println(user);
        System.out.println(pet);*/


        /*Person jone = run.getBean("person", Person.class);
        System.out.println(jone);*/


    }
}
