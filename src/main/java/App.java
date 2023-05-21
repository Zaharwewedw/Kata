import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean_ = 
        		(HelloWorld) applicationContext.getBean("helloworld");
        
        Cat cat = 
        		(Cat) applicationContext.getBean("cat");
        Cat cat_ = 
        		(Cat) applicationContext.getBean("cat");

        System.out.println(bean == bean_);
        System.out.println(cat == cat_);
        
    }
}