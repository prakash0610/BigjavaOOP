package question2;

public class BClass {
	private int bprivate;
	protected int bprotected;
	public int bpublic;
	int bpackage;

	/**
	 * Constructor for objects of class BClass.
	 */
	public BClass() {
		// Initialize instance variables
		bprivate = 1;
		bprotected = 2;
		bpublic = 3;
		bpackage = 4;
	}

	public int addem() {
		return bprivate + bprotected + bpublic + bpackage;
	}

}
