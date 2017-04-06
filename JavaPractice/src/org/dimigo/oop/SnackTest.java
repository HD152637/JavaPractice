/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ SnackTest
 *
 * 1. 개요 : 실습과제6 - 과자 배열
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class SnackTest {

	public static void main(String[] args) {
		Snack snack = new Snack();
		int sum=0;
		
		snack = new Snack("새우깡","농심",1100,2);
		sum += snack.getPrice() * snack.getNumber();
		System.out.println(snack);
		System.out.println();
		
		snack.setCompany("콘칲");
		snack.setName("크라운");
		snack.setPrice(1200);
		snack.setNumber(1);
		sum += snack.getPrice() * snack.getNumber();
		System.out.println(snack);
		System.out.println();
		
		snack.setCompany("허니버터칩");
		snack.setName("해태");
		snack.setPrice(1500);
		snack.setNumber(4);
		sum += snack.getPrice() * snack.getNumber();
		System.out.println(snack);
		System.out.println();
		System.out.println("총 구매 금액 : "+sum+"원");
	}

}
