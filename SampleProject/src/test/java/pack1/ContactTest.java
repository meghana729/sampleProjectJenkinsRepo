package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontactTest() {
		System.out.println("execute createcontactTest");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println("url="+URL);
		System.out.println("browser="+BROWSER);
		System.out.println("username="+USERNAME);
		System.out.println("password="+PASSWORD);
	}
	@Test
	public void modifycontacttest() {
		System.out.println("execute contactmodel");
	}
	

}
