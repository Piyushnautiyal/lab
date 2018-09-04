package xmlBasedConfigurations.definingBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author piyush.nautiyal
 * 
 * Please Run maven clean install before making any changes and running this main.
 *
 */

public class MyMain {

  private static ApplicationContext aContext;

  public static void main(String[] args) {
    aContext = new ClassPathXmlApplicationContext("xmlBasedConfiguration.xml");
    shape shape   = (Circle) aContext.getBean("circle");
    shape.draw();
  }
}
