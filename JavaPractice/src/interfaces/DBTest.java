/**
 * 
 */
package interfaces;

/**
 * <pre>
 * interfaces
 * 	 |_ DBTest
 *
 * 1. 개요 : 실습과제13 - DB가 바뀌었어요
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class DBTest {

	public static void main(String[] args) {

		IDBManager oracle = IDBManager.getDBObject("ORACLE");
		IDBManager sybase = IDBManager.getDBObject("SYBASE");
		
		crud(oracle);
		crud(sybase);
		
	}

	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}
}
