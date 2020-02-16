package question2;

public class AClass {
	private int aprivate;
	protected int aprotected;
	public int apublic;
	int apackage;
	static int noAObjects = 0;

	/**
	 * Think about these declarations
	 */
	BClass bobj = new BClass();
	CClass cobj = new CClass();

	/**
	 * Constructor for objects of class AClass.
	 */
	public AClass() {
		// Initialize instance variables
		aprivate = 1;
		aprotected = 2;
		apublic = 3;
		apackage = 4;
		noAObjects++;
	}

	public int addem() {
		// System.out.println(bobj.bprivate);
		//System.out.println(bobj.bprotected);
		// System.out.println(bobj.bpublic);
		// System.out.println(bobj.bpackage);
		// System.out.println(cobj.cprivate);
		// System.out.println(cobj.cprotected);
		// System.out.println(cobj.cpublic);
		// System.out.println(cobj.cpackage);
		return aprivate + aprotected + apublic + apackage;
	}

}
