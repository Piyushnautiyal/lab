import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	@Bean
	public  Knight knight() {
		return new Braveknight(quest());
	}
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
	

}
