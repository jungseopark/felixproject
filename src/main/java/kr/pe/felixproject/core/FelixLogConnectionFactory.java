package kr.pe.felixproject.core;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class FelixLogConnectionFactory {
	
	private static interface Singleton {
        final FelixLogConnectionFactory INSTANCE = new FelixLogConnectionFactory();
    }

	private DataSource dataSource;
	
	/**
	 * @param dataSource Spring에서 관리하는 dataSource
	 */
	public void setDataSource(DataSource dataSource) {
		Singleton.INSTANCE.dataSource = dataSource;
	}

	/**
	 * Spring에서 설정한 dataSource를 통해 Connection을 생성하고 리턴한다. 
	 * 
	 * @return Connection
	 * @exception SQLException
	 */
	public static Connection getDatabaseConnection() throws SQLException {
		return Singleton.INSTANCE.dataSource.getConnection();
    }


}
