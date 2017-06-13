/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <pre>
 * org.dimigo.collection
 * 	 |_ MelonGenreChart
 *
 * 1. 개요 : 실습과제16 - 멜론 차트 (장르별)
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class MelonGenreChart {

	public static void main(String[] args) {

		System.out.println("-- << 멜론 장르별 챠트 >> --");
		
		List<Music> danceList = new ArrayList<Music>();
		danceList.add(new Music("I LUV IT","PSY"));
		danceList.add(new Music("맞지?", "언니쓰"));
		
		List<Music> balardList = new ArrayList<Music>();
		balardList.add(new Music("팔레트", "아이유"));
		
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		map.put("발라드", balardList);
		map.put("댄스", danceList);
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		map.get("댄스").set(1, new Music("SIGNAL","트와이스"));
		printMap(map);

		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
		
	}
	private static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet())
		{
			System.out.println("["+key+"]");
			for(int i=0; i<map.get(key).size();i++)
			{
				System.out.println((i+1) + ". " + map.get(key).get(i));
			}
		}
		System.out.println();
	}

}
