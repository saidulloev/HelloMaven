package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.car.Audi;
import spring.car.Kia;

public class Main {

    public static void main(String[] args) {
//        Audi audi = new Audi();
//        audi.setAudioSystem(new Alpine());
//        audi.move();
//        audi.getAudioSystem().playRadio();

//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Audi audi = context.getBean("audi", Audi.class);
//        audi.move();

//        audi.setAudioSystem(context.getBean("sony", Sony.class));
//        audi.getAudioSystem().playRadio();
//        audi.getNavigationSystem().createRoute();

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Audi audi = context.getBean(Audi.class);
        audi.move();
        audi.getNavigationSystem().createRoute();
        audi.getAudioSystem().playRadio();

        context.getBean(Kia.class).move();

    }

}
