/**
 * 
 */
package org.dimigo.interfaces;


/**
 * <pre>
 * interfaces
 * 	 |_ IDBManager
 *
 * 1. 개요 : 실습과제13 - DB가 바뀌었어요
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	
	public static IDBManager getDBObject(String database){
		if(ORACLE_DATABASE.equals(database)){
			return new OracleDB();
		}
		else if(SYBASE_DATABASE.equals(database)){
			return new SybaseDB();
		}
		else return null;
	}
	
}
