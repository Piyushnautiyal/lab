import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Knightmain {
	public static void main(String[] args) {
		ApplicationContext ctx  = new AnnotationConfigApplicationContext(Appconfig.class);

		Knight knight = ctx.getBean(Knight.class);
		//Knight knight = (Knight) ctx.getBean("knight");	
		knight.embarkonQuest();
	}

}
