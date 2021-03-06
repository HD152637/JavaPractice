/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Galaxy
 *
 * 1. 개요 : 실습과제11 - 스마트폰 경쟁
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class Galaxy extends SmartPhone{
	public Galaxy() {
		super();
	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
