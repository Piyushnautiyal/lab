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
		return new BaseballGame();
		//return new BaseballGame();
	}
	//	@Bean(name="Manas")
	/*we have created a bean name for autowiring purpose check BaseBall class we have two references there 1.homeTeam 2.awayTeam
	 of type Team so we have created bean name to achieve autowiring by Name as byType is not possible due to same refernce type i.e
	 Team */
	@Bean(name="homeTeam")
	public Team redSox()
	{
		return new RedSox();
	}
	@Bean
	public Team cubs()
	{
		return new Cubs();
	}
	@Bean(name="awayTeam")
	public Team royals()
	{
		return new Royals();
	}

}
