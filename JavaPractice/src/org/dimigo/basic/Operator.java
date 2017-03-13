/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ Operator
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author		: HD152637 홍민호
 * @version		: 1.0
**/

public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< 디미베네 연간 인건비 >>");
		long s=1700000L;
		long p=3L;
		long n=1500L;
		long sum=s*p*n*12;
		
		System.out.printf("월 평균 급여 : %,d원\n",s);
		System.out.printf("점포 내 직원 : %,d명\n",p);
		System.out.printf("점포 수 : %,d개\n\n",n);
		
		System.out.println("연간 인건비 : "+String.format("%,d",sum)+'원');
	}

}
