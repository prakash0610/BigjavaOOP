package question2;



public class ASubClass extends AClass {
	private int adprivate;
	protected int asprotected;
	public int aspublic;
	int aspackage;

	/**
	 * Think about these declarations
	 */
	BClass bobj = new BClass();
	CClass cobj = new CClass();

	/**
	 * Constructor for objects of class ASubClass
	 */
	public ASubClass() {
		// Initialize instance variables
		//asprivate = 1;
		asprotected = 2;
		aspublic = 3;
		aspackage = 4;
	}

	public int addem() {
		// System.out.println(bobj.bprivate);
		// System.out.println(bobj.bprotected);
		// System.out.println(bobj.bpublic);
		// System.out.println(bobj.bpackage);
		// System.out.println(cobj.cprivate);
		// System.out.println(cobj.cprotected);
		// System.out.println(cobj.cpublic);
		// System.out.println(cobj.cpackage);
		// System.out.println(aprivate);
		// System.out.println(aprotected);
		// System.out.println(apublic);
		// System.out.println(apackage);
		return adprivate + asprotected + aspublic + aspackage + aprotected + apublic + apackage;
	}

}
