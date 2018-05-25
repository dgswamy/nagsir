/**
 * This class loads the properties used throughout the project
 * from properties file
 * 
 */
package platform.constants;

import java.io.IOException;
import java.util.Properties;

public class PlatformConstants {
	static Properties properties = null;
	static{
		properties = new Properties();
		try {
			properties.load(PlatformConstants.class.getClassLoader().getResourceAsStream("platform.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//static
	
	public static final String DB_DRIVER = properties.getProperty("db_driver");
	public static final String DB_URL = properties.getProperty("db_url");
	public static final String DB_USERNAME = properties.getProperty("db_username");
	public static final String DB_PASSWORD = properties.getProperty("db_password");
	public static final String DB_LOOKUP = properties.getProperty("db_lookup");
	public static final String USE_SSL = properties.getProperty("use_ssl");
	
	
	public static void main(String[] args) {
		System.out.println(DB_DRIVER);
	}

}
