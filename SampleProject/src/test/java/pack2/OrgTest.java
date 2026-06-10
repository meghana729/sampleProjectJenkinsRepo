package pack2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void createorgtest() {
		System.out.println("execute createcontactTest");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println("url="+URL);
		System.out.println("browser="+BROWSER);
		System.out.println("username="+USERNAME);
		System.out.println("password="+PASSWORD);
		System.out.println("execute org test");
	}
	@Test
	public void modifyorgtest() {
		System.out.println("execute modifyorgtest");
	}
}
