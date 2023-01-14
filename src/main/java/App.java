import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        //System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);
        System.out.println("Результат сравнения для HelloWorld: " + (bean == bean2));
        System.out.println("Результат сравнения для Cat: " + (cat1 == cat2));
    }
}