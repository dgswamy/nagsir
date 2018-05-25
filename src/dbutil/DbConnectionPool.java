package dbutil;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import platform.constants.PlatformConstants;

public class DbConnectionPool {
	 private static ComboPooledDataSource cpds = null;
	 //private static DataSource dataSource = null;
	
	 // JDBC Driver Name & Database URL
	    static final String JDBC_DRIVER = PlatformConstants.DB_DRIVER;  
	    static final String JDBC_DB_URL = PlatformConstants.DB_URL+"ems"+PlatformConstants.USE_SSL;
	 
	    // JDBC Database Credentials
	    static final String JDBC_USER = PlatformConstants.DB_USERNAME;
	    static final String JDBC_PASS = PlatformConstants.DB_PASSWORD;
	    
	    static {
	    	try {
	    		cpds = new ComboPooledDataSource();
				cpds.setDriverClass(JDBC_DRIVER);
				cpds.setJdbcUrl(JDBC_DB_URL);
				cpds.setUser(JDBC_USER);;
				cpds.setPassword(JDBC_PASS);
				
				cpds.setInitialPoolSize(10);
				cpds.setMaxPoolSize(50);
				cpds.setMinPoolSize(10);
				cpds.setAcquireIncrement(5);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    public static Connection getPollConnection() {
            try {
				return cpds.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
        }

	    public static void main(String[] args) {
			Connection con = DbConnectionPool.getPollConnection();
			if(con != null) {
				System.out.println("wow");
			}
		}

}
