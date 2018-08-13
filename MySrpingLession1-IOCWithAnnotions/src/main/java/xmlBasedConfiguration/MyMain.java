package xmlBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

  private static ApplicationContext aContext;

  public static void main(String[] args) {
    aContext = new ClassPathXmlApplicationContext("xmlBasedConfiguration.xml");
    shape shape   = (Circle) aContext.getBean("circle");
    shape.draw();
  }
}
