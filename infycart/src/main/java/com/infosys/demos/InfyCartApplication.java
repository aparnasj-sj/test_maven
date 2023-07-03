package com.infosys.demos;

/**
 * Hello world!
 *
 */

import java.sql.Connection;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.infosys.demos.dao.DataBaseUtil;
public class InfyCartApplication {
private static Logger logger= Logger.getLogger(InfyCartApplication.class);
    
    public static void main(String[] args) throws Exception    {
        
        Connection connection=getConnection();
       
        if(connection !=null ){
        	logger.info("Connection established");
        }else{
            System.out.println("the conn obj is null");
        }
        
    }
     //loading log4j.properties to do logging
     static void init() {
        PropertyConfigurator.configure("log4j.properties");
    }
     public static Connection getConnection(){
    	 return DataBaseUtil.getInstance().availConnection();
     }
}

