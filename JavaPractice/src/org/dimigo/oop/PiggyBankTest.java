/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBankTest
 *
 * 1. 개요 : 실습과제8 - 돼지 저금통
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class PiggyBankTest {

	public static void main(String[] args) {
		
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(brother, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(me, 1000);
		PiggyBank.printBalance();
	}
}

