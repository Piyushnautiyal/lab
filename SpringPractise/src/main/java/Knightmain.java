import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Knightmain {
	public static void main(String[] args) {
/*		ApplicationContext ctx  = new AnnotationConfigApplicationContext(Appconfig.class);

		Knight knight = ctx.getBean(Knight.class);*/
		//Knight knight = (Knight) ctx.getBean("knight");	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkonQuest();
	}

}
