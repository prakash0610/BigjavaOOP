# BigjavaOOP
inheritance 
Chapter 10: Inheritance



1.1. Consider using the following Card class.

public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
}

Use this class as a superclass to implement a hierarchy of related classes: 

Class	Data
IDCard	ID number
CallingCard	Card number, PIN
DriverLicense	Expiration year

Write declarations for each of the subclasses. For each subclass, supply private instance variables. Leave the bodies of the constructors and the format methods blank for now.

Ans:  
…….

Note that DriverLicense entends IDCard, not Card.  Also note that this class will not compile until we complete Lab 10.1.2.





1.2. Implement constructors for each of the three subclasses. Each constructor should call the superclass constructor to set the name. Here is one example:

public IDCard(String n, String id)
{  
   super(n);
   idNumber = id;
}




1.3. Replace the implementation of the format method for the three subclasses. The methods should produce a formatted description of the card details. The subclass methods should call the superclass format method to get the formatted name of the cardholder.



1.4.  Devise another class, Billfold, which contains slots for two cards, card1 and card2, a method void addCard(Card) and a method String formatCards().

The addCard method checks whether card1 is null. If so, it sets card1 to the new card. If not, it checks card2. If both cards are set already, the method has no effect.

Of course, formatCards invokes the format method on each non-null card and produces a string with the format

[card1|card2]

What is your Billfold class?


1.5.  Write a tester program that adds two objects of different subclasses of Card to a Billfold object. Test the results of the formatCards methods.

What is the code for your BillfoldTester class?

Ans:  

1.6.  Explain why the output of your BillfoldTester program demonstrates polymorphism.

Ans:  

1.7  The Card superclass defines a method isExpired, which always returns false. This method was overridden in DriverLicense with an identical body, but the method is not appropriate for the driver license. Supply a method body for DriverLicense.isExpired() that checks whether the driver license is already expired (i.e., the expiration year is less than the current year).

To work with dates, you can use the methods and constants supplied in abstract class Calendar which are inherited by the concrete class GregorianCalendar. You create a Calendar as follows:

GregorianCalendar calendar = new GregorianCalendar();

Then, you can obtain the current year using the constant Calendar.YEAR and method get in GregorianCalendar.  The constant indicates that the method should return the current year.  By comparing the returned value with the expYear field in DriverLicense, you can determine if the card is expired.  The code below will retrieve the current year.

calendar.get(Calendar.YEAR)

Ans:  
import java.util.GregorianCalendar;
import java.util.Calendar;



1.8.  The ID card and the phone card don't expire. What should you do to reflect this fact in your implementation?

Ans:  



1.9.  Add a method getExpiredCardCount, which counts the number of expired cards in the billfold, to the Billfold class.

Ans:     


1.10.  Write a BillfoldTester class that populates a billfold with a phone card and an expired driver license. Then call the getExpiredCardCount method. Run your tester to verify that your method works correctly.

What is your tester class?

Ans:  




1.11.  Implement toString methods for the Card class and its three subclasses. The methods should print:

	the name of the class
	the values of all instance variables (including inherited instance variables)

Typical formats are:

Card[name=Edsger W. Dijkstra] 
CallingCard[name=Bjarne Stroustrup][number=4156646425,pin=2234]
 
Write the code for your toString methods.



1.12.  Implement equals methods for the Card class and its three subclasses. Cards are the same if the objects belong to the same class, and if the names and other information (such as the expiration year for driver licenses) match.

Give the code for your equals methods.


1.13.  Change the Card class and give protected access to name. Would that change simplify the toString method of the CallingCard class? How?

Is this change advisable?

Ans:  



2.  Start by building a default directory that contains the class files AClass, BClass, and ADerivedClass.  All the classes you need for this assignment are already written and listed below.  The default directory should contain a subdirectory called Temp that contains the class file CClass.  

Inside AClass and ADerivedClass there is a method called addem which contains a number of lines that are commented out.  Uncomment one line at a time.  Write a comment under each line that describes why the line above it will or will not compile.  Be sure to keep the import and package statements in the original code.  Comment out any lines that won’t compile in the final submission.  

Explain how package access variables differ from protected access variables.

---------------------
import Temp.*;

public class ADerivedClass extends AClass
{
   private int adprivate;
   protected int adprotected;
   public int adpublic;
   int adpackage;

   /**
        Think about these declarations
   */
   BClass bobj = new BClass();
   CClass cobj = new CClass();

   /**
      Constructor for objects of class ADerivedClass
   */
   public ADerivedClass()
   {
      // Initialize instance variables
      aprivate = 1;
      aprotected = 2;
      apublic = 3;
      apackage = 4;
   }

   public int addem()
   {
      //System.out.println(bobj.bprivate);
      //System.out.println(bobj.bprotected);
      //System.out.println(bobj.bpublic);
      //System.out.println(bobj.bpackage);
      //System.out.println(cobj.cprivate);
      //System.out.println(cobj.cprotected);
      //System.out.println(cobj.cpublic);
      //System.out.println(cobj.cpackage);
      //System.out.println(aprivate);
      //System.out.println(aprotected);
      //System.out.println(apublic);
      //System.out.println(apackage);
      return adprivate + adprotected + adpublic + adpackage
         + aprotected + apublic + apackage;
   }
}

---------------------
package Temp;

public class CClass 
{
   private int cprivate;
   protected int cprotected;
   public int cpublic;
   int cpackage;



3.1  The Person class below has a private instance variable for a person’s name and a reference variable called myPet that will refer to a Dog object.  Each Person object is instantiated with a reference to a Dog object.  The class also has a method called tellPetToSpeak that invokes the speak method in Dog.  

Each Dog object has a name and a String variable called dogTalk that defines what the dog can say.  You should note that there is a setDogTalk method which can be used to modify what the dog says.  

The PersonRunner class has a main method that creates a Dog object rex and a Person object cathy that refers to rex.  We use cathy to invoke the speak method in rex.  First run the main program and familiarize yourself with these two simple classes.

Notice that we have implemented a clone method in Person.  This version of clone can be used to create another Person object, but it has been implemented in a way that makes a shallow copy of the Person object.  This means that when a Person is cloned, the reference to the Dog object is simply copied into the new Person object.  Using this version of clone implies that all new Person objects that are cloned from cathy will share the same Dog object, rex.  

The goal in this problem is to modify the main method in PersonRunner and prove that any new Person that is created by cloning cathy will share rex.  Write a description that explains your methodology. 



3.2  Revise the clone method in Person so it makes a deep copy.  Run the last version of your main method from Lab 10.3.1 to prove that the deep copy worked.  

This change will require modifications in Person and Dog.  One important change is that Dog must implement Cloneable.







