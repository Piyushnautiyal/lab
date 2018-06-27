package com.spring.di.configurations;
/*
 * @Configuration annotation is used to let Spring know that it’s a Configuration class.
@ComponentScan annotation is used with @Configuration annotation to specify the packages to look for Component classes.
@Bean annotation is used to let Spring framework know that this method should be used to get the bean implementation to inject in Component classes.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.services.EmailServices;
import com.spring.di.services.MessageServices;
@Configuration
@ComponentScan(value={"com.spring.di.consumer"})
public class DIConfiguration {

	/*
	 * Here, the method name is annotated with @Bean works as bean ID and it creates and returns the actual bean.
	 */
	@Bean
	public MessageServices getMessageService(){
		return new EmailServices();
	}
}