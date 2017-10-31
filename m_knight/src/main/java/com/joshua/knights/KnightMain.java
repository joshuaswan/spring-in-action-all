package com.joshua.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by joshua on 2017/10/31.
 */
public class KnightMain {

    public static void main(String... args) throws Exception{
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("META-INF/spring/knight.xml");

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
