package question3;

public class Person {
	private String pName;
	Dog myPet= new Dog();
	
	
	public void tellPetToSpeak() {
		 myPet.speak();
		
	}
	
	
	public Person(String pName, Dog myPet) {
		super();
		this.setpName(pName);
		this.myPet = myPet;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
	
	

}
