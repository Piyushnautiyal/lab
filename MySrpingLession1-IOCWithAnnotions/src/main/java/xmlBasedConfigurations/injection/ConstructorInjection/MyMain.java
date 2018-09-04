package xmlBasedConfigurations.injection.ConstructorInjection;

import org.springframework.context.ApplicationContext;
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
        
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("InjectionConstructorBased.xml");
        
        SomeDemoClass   someDemoClass  = (SomeDemoClass)applicationContext.getBean("someDemoBean");
        System.out.println(someDemoClass);
        
        SomeDemoClass   someDemoClass2  = (SomeDemoClass)applicationContext.getBean("someDemoBean2");
        System.out.println(someDemoClass2);
    }
}