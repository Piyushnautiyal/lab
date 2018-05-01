package com.oreilly.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oreilly.Appconfig.AppConfig;
import com.oreilly.entities.BaseballGame;
import com.oreilly.entities.Game;
import com.oreilly.entities.Team;

public class RunDemo {

	public static void main(String[] args) {
		ApplicationContext ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game  = ctx.getBean("game",Game.class);

		Team redsox = ctx.getBean("redSox",Team.class);
		Team cubs = ctx.getBean("cubs", Team.class);
		Team royals = ctx.getBean("royals",Team.class);

		game.setHomeTeam(royals);
		game.setAwayTeam(cubs);

		System.out.println(game.playGame());

		game.setHomeTeam(cubs);
		game.setAwayTeam(redsox);
		System.out.println(game.playGame());
	}

}
