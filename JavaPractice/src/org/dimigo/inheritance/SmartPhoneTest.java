/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhoneTest
 *
 * 1. 개요 : 실습과제11 - 스마트폰 경쟁
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
			new IPhone("iPhone 7","애플",900000),
			new Galaxy("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone p : phones){
			System.out.println(p);
			p.turnOn();
			p.pay();
			p.useSpecialFunction(p);
			p.turnOff();
			System.out.println();
		}
	}

}
