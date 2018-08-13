package javaBasedConfiguration.components;

import org.springframework.stereotype.Component;

@Component
public class Square implements shape {

  public Square() {
    
  }
  public void draw() {
    System.out.println("I am drawing a square");
  }
}
