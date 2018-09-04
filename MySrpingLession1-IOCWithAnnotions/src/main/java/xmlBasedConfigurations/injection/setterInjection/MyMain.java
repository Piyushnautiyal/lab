package xmlBasedConfigurations.injection.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    /**
     * 
     * @author piyush.nautiyal
     * 
     * Please Run maven clean install before making any changes and running this main.
     *
     */
    
    public static void main(String args []) {
        
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("InjectionSetterBased.xml");
        
        SomeDemoClass2   someDemoClass  = (SomeDemoClass2)applicationContext.getBean("someDemoBean2");
        System.out.println(someDemoClass);
    }
}
