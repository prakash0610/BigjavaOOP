
public class IDCard extends Card {
	
	private String IDNumber;

	public IDCard(String n, String IDNumber) {
		super(n);
		this.IDNumber=IDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	
	public String format() {
		return super.format()+" [ID Number: "+IDNumber+"]";
	}
	
	public boolean equals(Object otherObject)
	   {
	      if (getClass() == otherObject.getClass())
	      {
	         IDCard other = (IDCard) otherObject;
	         return getName().equals(other.getName())
	               && IDNumber.equals(other.IDNumber);
	      }
	      
	      return false;
	   }


}
