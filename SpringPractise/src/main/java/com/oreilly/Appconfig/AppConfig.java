package com.oreilly.Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oreilly.entities.BaseballGame;
import com.oreilly.entities.Cubs;
import com.oreilly.entities.Game;
import com.oreilly.entities.RedSox;
import com.oreilly.entities.Royals;
import com.oreilly.entities.Team;

@Configuration
public class AppConfig {
	//By Default Bean Id is same as method name but if we want to give different name the use @Bean(name="<bean Name>") 
	@Bean
	public Game game()
	{
		//return new BaseballGame(redSox(),cubs());
		return new BaseballGame();
	}
//	@Bean(name="Manas")
	@Bean
	public Team redSox()
	{
		return new RedSox();
	}
	@Bean
	public Team cubs()
	{
		return new Cubs();
	}
	@Bean
	public Team royals()
	{
		return new Royals();
	}

}
