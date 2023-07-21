package khorsun.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer= classPathXmlApplicationContext.getBean("computer",Computer.class);
        System.out.println(computer);




        classPathXmlApplicationContext.close();


    }
}
