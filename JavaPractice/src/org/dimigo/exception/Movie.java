/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	 |_ Movie
 *
 * 1. 개요 : 실습과제14 - 디미 씨네마
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class Movie {
	
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}

	public void buyTicket(int age) throws Exception{
		try{
			if(age >= limitAge){
				throw new Exception(title + " 즐감하세요.");
			}
			else{
				throw new Exception(title + "은/는 "+limitAge+"세 이상 관람가입니다.");
			}
		} catch (Exception e){
			throw e;
		}
	}
	
}
