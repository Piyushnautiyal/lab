
public class Braveknight implements Knight {
	
	private Quest quest;
	
	public Braveknight(Quest quest)
	{
		this.quest = quest;
	}

	public void embarkonQuest() {
		quest.embark();
	}

}
