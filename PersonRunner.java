package question3;

public class PersonRunner {

	public static void main(String[] args) {
		Dog rex= new Dog();
		Person cathy= new Person("cathy", rex);
		Dog tex=new Dog();
		
		Person prakash= new Person(" ", tex);
		
		
		cathy.tellPetToSpeak();
		prakash.tellPetToSpeak();

	}

}
