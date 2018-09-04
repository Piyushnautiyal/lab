package javaBasedConfigurations.explicitly.definingBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean("circle")
  public Circle circle() {
    return new Circle();
  }
  
  @Bean("square")
  public Square square() {
    return new Square();
  }
}
