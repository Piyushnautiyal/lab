

public class PakageInfo {
	/*
	 * beans element default-autowire is used to define the default autowiring method. Here I am defining the default autowiring method to be byName.
	 * 
beans element default-autowire-candidates is used to provide the pattern for bean names that can be used for autowiring. 
For simplicity I am allowing all the bean definitions to be eligible for autowiring, however if we can define some pattern for autowiring. 
For example, if we want only DAO bean definitions for autowiring, we can specify it as default-autowire-candidates="*DAO".


autowire-candidate="false" is used in a bean definition to make it ineligible for autowiring. It’s useful when we have multiple bean definitions 
for a single type and we want some of them not to be autowired. For example, in above spring bean configurations “employee1” bean will not be used for 
autowiring.


autowire attribute byName, byType and constructor is self understood, nothing much to explain there.


context:annotation-config is used to enable annotation based configuration support. Notice that employeeAutowiredByTypeService and 
employeeAutowiredByConstructorService beans don’t have autowire attributes.
	 */

}
