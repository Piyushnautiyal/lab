import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream)
	{
		this.stream = stream;
	}
	public void embark() {
		System.out.println("SlayDragon quest");
		
	}

}
