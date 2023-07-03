package com.infosys.demo2.dao;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.log4j.Logger;
public class DataBaseUtil {
	private static final DataBaseUtil dataBaseUtil = new DataBaseUtil();
	private Connection connection;
	private static Logger logger= Logger.getLogger(DataBaseUtil.class);
	
	private DataBaseUtil()	{
		System.out.println("executed");
		Properties prop = new Properties();
		String configFile = "dbconfig.properties";
		
		//loading db specific configuration info
		// i can test connection on shell via
		// nc -zv localhost 3306
		// try{
		// 	InputStream input = DataBaseUtil.class.getClassLoader().getResourceAsStream(configFile);
		// 	prop.load(input);
		// }
		// catch(IOException exc){
		// 	logger.error("Could not load dbconfig properties file");
		// }
		// try{
		// Class.forName("com.mysql.cj.jdbc.Driver");
		// }catch(Exception e){

		// } 
		String dburl="jdbc:mysql://localhost:3306/retail_db";
        String dbname="root";
       String dbpassword="";

		// String dburl = prop.getProperty("dburl");
		// String dbname = prop.getProperty("dbusername");
		// String dbpassword = prop.getProperty("dbpassword");
		
		//establishing connection
		try	{
			// Register driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// jdbc connection creation
			connection = DriverManager.getConnection(dburl,dbname,dbpassword);
		}catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } 
		catch(SQLException exc)		{
			System.out.println("Exception encountereed ");
			logger.error("Connection could not be established successfully. Please check for the connection parameters");
		}
	}
	public Connection availConnection(){
		return connection;
	}
	public static DataBaseUtil getInstance(){
		return dataBaseUtil;
	}
	
}
