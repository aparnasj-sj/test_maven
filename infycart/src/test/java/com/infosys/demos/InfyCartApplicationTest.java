package com.infosys.demos;
import java.sql.Connection;
import org.junit.Assert;
import org.junit.Test;
public class InfyCartApplicationTest {
  @Test
  public void testGetConnection(){
	 Connection con=InfyCartApplication.getConnection();
	  Assert.assertNotNull(con);
  }
}
