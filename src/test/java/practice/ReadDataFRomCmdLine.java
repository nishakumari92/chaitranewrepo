package practice;

import org.testng.annotations.Test;

public class ReadDataFRomCmdLine {
	
	@Test
	public void read()
	{
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
