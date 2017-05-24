/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ PersonTest
 *
 * 1. 개요 : 실습과제9 - We Are the World!!s
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(Person p : persons){
			System.out.println(p);
		}
		System.out.println();
		for(Person p : persons){
			p.sayHello();
		}
		System.out.println();
		for(Person p : persons){
			p.sayBye();
		}
	}

}
