
public class Person {
	
	String Name;
	String Superpower;
	
	String getName() {
		return Name;
	}
	
	String getSuperpower() {
		return Superpower;
	}
	
	void setName(String Name1) {
		Name = Name1;
	}
	
	void setSuperpower(String Superpower1) {
		Superpower = Superpower1;
	}
	
	public String toString() {
		return Name + " has mad" + Superpower + "skills";
		
	}
}
