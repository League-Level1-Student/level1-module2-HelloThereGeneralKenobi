
public class SeaCreatureRunner {
	public static void main(String[] args) {
		
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		
		Spongebob.eat();
		Spongebob.laugh();
		
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
	}
}
