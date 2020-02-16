
public class CallingCard extends Card {
	
	private String cardNumber;
	private String pin;

	public CallingCard(String n,String cardNumber, String pin) {
		super(n);
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	
	public String format() {
		return super.format()+" [Card Number: "+cardNumber+" ,Pin: "+pin+"]";
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	   public boolean equals(Object otherObject)
	   {
	      if (getClass() == otherObject.getClass())
	      {
	         CallingCard other = (CallingCard) otherObject;
	         return getName().equals(other.getName())
	               && cardNumber.equals(other.cardNumber) && pin == other.pin;
	      }
	      
	      return false;
	   }

	

}
