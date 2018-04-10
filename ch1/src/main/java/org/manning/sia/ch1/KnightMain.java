package org.manning.sia.ch1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        // je nach DI, in dem Fall gibt es aber eh nur 1 Möglichkeit
        Knight knight = context.getBean(Knight.class);
        // Quest je nach DI
        knight.embarkOnQuest();
        context.close();
    }
}
