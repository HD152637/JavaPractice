/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ PersonTest2
 *
 * 1. 개요 : 실습과제10 - We Are the World2!!
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class PersonTest2 {

	public static void main(String[] args) {
		Person[] persons = {		
			new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")
		};
		for (Person p : persons){
			greeting(p);
		}
	}

	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
}
