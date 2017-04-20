/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ Loop
 *
 * 1. 개요 : 초간단 게임 프로그래밍
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, atk=100, a;
		String[] job = {"마법사","영주","기사","농민"};
		do {			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("--------------------");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.printf("메뉴 입력 => ");
			 
			n = scanner.nextInt();
			
			switch (n){
			case 1:
				atk += 10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",atk);
				break;
			case 2:
				atk -= 10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",atk);
				break;
			case 3:
				a = new Random().nextInt(job.length);
				System.out.printf("%s(으)로 설정되었습니다.\n",job[a]);
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
			}
		} while (n != 9);
	}

}
