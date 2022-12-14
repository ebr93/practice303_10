package org.perscholas.practice303_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaPractice {

	public static void main(String[] args) {
		// Question 1
		printUsingLambda();
		System.out.println("********************************\nQuestion 2");
		
		// Question 2
		TestStaticMethod tsm = new TestStaticMethod();
		tsm.methodTwo();
		StaticMethods.methodOne();
		System.out.println("********************************\nQuestion 3");
		
		// Question 3
		Question3.result();
		System.out.println("********************************\nQuestion 4");
		
		// Question 4
		Question4.result();
		System.out.println("********************************\nQuestion 5");
		
		// Question 5
		AddTwoNumbers atn = (x, y) -> x + y;
		System.out.println(atn.add(120, 200));
		System.out.println("********************************\nQuestion 6");
		
		// Question 6
		atn = (x, y) -> x - y;
		System.out.println(atn.add(120, 200));
	}
	
	/*
	 * 1.Use three different forms of a  lambda expression in the ArrayList's forEach() method to print every item in the list:
		parameter -> expression
		(parameter) -> expression
		(parameter) ->{ expression}
	 * 
	 */

	public static void printUsingLambda() {
		ArrayList<String> names = new ArrayList<>();

		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		Collections.addAll(names, firstName);

		names.forEach(n -> System.out.println(n));
		System.out.println("********************************");
		names.forEach((n) -> System.out.println(n));
		System.out.println("********************************");
		names.forEach((n) -> {System.out.println(n);});

	}

}

/*
 * 2. Create an interface called StaticMethods with a static void method called methodOne. 
 * Inside the body of method create a print statement that prints the letter (m) in lowercase. 
 * Next create a class called TestStaticMethod that implements the interface StaticMethods.  
 * Override methodTwo and print out the letter (m)  in uppercase. Print both methods 
 * from the StaticMethods interface. Is it possible to to call methodOne from the class 
 * TestStaticMethod? If not, find a way to call the method  named methodOne from 
 * the StaticMethods interface.Why can’t you call methodOne from the TestStaticMethod?
*/

interface StaticMethods {
	abstract void methodTwo();
	
	static void methodOne() {
		System.out.println("m");
	};
}

class TestStaticMethod implements StaticMethods {
	public TestStaticMethod() {
		
	}
	
	@Override
	public void methodTwo() {
		System.out.println("m".toUpperCase());
	}	
}

/*
 *3. Using any of the three different forms of a  lambda expression list above print every item in the list with their index. Hint you can use the index.of method from Class ArrayList. 
	Your output should look like this
	0 Harold
	1 Luciano
	2 Tyree
	3 Nyla
	4 Natalie
	5 Quincy
	6 Devyn
	7 Aliana
 */

class Question3 {
	public static void result() {
		List<String> listOfNames = new ArrayList<>();
		String[] names = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
		Collections.addAll(listOfNames, names);
		listOfNames.forEach((n) -> System.out.println("Index: " +listOfNames.indexOf(n) + " Name: " + n ));
	}
}

/*
 * 4. Using any of the three different forms of a  lambda expression list above print every item in the list in capital letters. 
		Your output should look like this
		
		HAROLD
		LUCIANO
		TYREE
		NYLA
		NATALIE
		QUINCY
		DEVYN
		ALIANA
 */

class Question4 {
	public static void result() {
		List<String> listOfNames = new ArrayList<>();
		String[] names = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
		Collections.addAll(listOfNames, names);
		listOfNames.forEach(n -> System.out.println(n.toUpperCase()));
	}
}

/*5. Create a functional interface called  AddTwoNumbers  with a method called add. The datatype for 
 *  the method is of type Integer and the parameters are two ints. Use lambdas expressions to add the two values together. 
	Example: 
	(parameter) -> expression
	(parameter) ->{ expression}
	AddTwoNumbers numbers = Use one of the above lambdas expressions ;
	System.out.println(numbers.add(#,#));
 */

interface AddTwoNumbers {
	Integer add(int x, int y);
}



