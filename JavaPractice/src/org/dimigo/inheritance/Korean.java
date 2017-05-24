/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Korean
 *
 * 1. 개요 : 실습과제9 - We Are the World!!
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class Korean extends Person{

	public Korean(String name) {
		super(name);
	}
	
	public void sayHello(){
		System.out.println("안녕하세요");
	}
	
	public void sayBye(){
		System.out.println("안녕히 계세요");
	}

	public String toString() {
		return "저는 한국사람 "+ super.getName() +"입니다.";
	}

	
}
