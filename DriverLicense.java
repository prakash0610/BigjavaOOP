import java.util.GregorianCalendar;
import java.util.Calendar;

public class DriverLicense extends IDCard {
	private int expYear;

	public DriverLicense(String n, String iDNumber, int expYear) {
		super(n, iDNumber);
		this.expYear = expYear;

	}

	public String format() {
		return super.format() + " [Expiration Year: " + expYear+"]";
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();

		if (calendar.get(Calendar.YEAR) > expYear) {
			return true;
		} else {

			return false;
		}

	}
	
	public boolean equals(Object otherObject)
	   {
	      if (getClass() == otherObject.getClass())
	      {
	         DriverLicense other = (DriverLicense) otherObject;
	         return getName().equals(other.getName())
	               && getIDNumber().equals(other.getIDNumber())
	               && expYear == other.expYear;
	      }
	      
	      return false;
	   }


}
