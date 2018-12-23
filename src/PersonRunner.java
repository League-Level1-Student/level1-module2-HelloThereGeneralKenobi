
public class PersonRunner {
	public static void main(String[] args) {
		Person Bob = new Person();
		Person Jeff = new Person();
		Person Bartholomew = new Person();
		
		Bob.setSuperpower(" the ability to wink both eyes at the same time ");
		Jeff.setSuperpower(" really sharp elbows ");
		Bartholomew.setSuperpower(" the ability to speedwalk slightly faster than normal ");
		Bob.setName("Bob");
		Jeff.setName("Jeff");
		Bartholomew.setName("Bartholomew");
		
		System.out.println(Bob.toString());
		System.out.println(Jeff.toString());
		System.out.println(Bartholomew.toString());
	}
}
