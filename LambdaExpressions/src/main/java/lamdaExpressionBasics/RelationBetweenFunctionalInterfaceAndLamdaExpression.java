package lamdaExpressionBasics;

public class RelationBetweenFunctionalInterfaceAndLamdaExpression {
    /**
     * 
     * 1. Lambda expressions basically express instances of functional interfaces
     * 2. lambda expressions implement the only abstract function 
     *    and therefore implement functional interfaces
     * 
     */
    
    public static void main(String[] args) {
        
        FunctionalInterfaceDemo functionalInterfaceDemo = ()->{System.out.println("Do something method is called");};
        functionalInterfaceDemo.doSomething();
    }
}
