
public class BillfoldTester {

	public static void main(String[] args) {
		
		//IDCard id= new IDCard("prakash","19920610");
		CallingCard cc = new CallingCard("sanju","14789khsdbvvcd","6961");
		DriverLicense dl = new DriverLicense("sangam","ajvcj146",2010);
		
		Billfold b = new Billfold();
		
		b.addCard(dl);
		b.addCard(cc);
		
		System.out.println(b.formatCards());
		System.out.println("Number of Expired Cards: "+ b.getExpiredCardCount());
		//System.out.println(dl.equals(cc));

	}

}
