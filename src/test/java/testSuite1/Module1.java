package testSuite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module1 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before every method");
            System.out.println("I am executing before every method");
            System.out.println("I am executing before every method");
	}
	@Test
	public void test001() {
		System.out.println("I am executing test case001");
	}
	@Test
	public void test002() {
		System.out.println("I am executing test case002");
	}
	@Test(groups ={"smoke", "sanity"})
	public void test003() {
		System.out.println("I am executing test case003");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after every method");
	}
	@DataProvider
	public Object[][] data001(){
		Object[][]data = {{"Sree", "pass01"},{"unni", "pass02"}};
		return data;
	}
	
	
	@Test(dataProvider = "data001")
	public void login(String username, String password) {
		
		System.out.println(username + "and" + password);
		
	}
	//public static void main(String[]args) {
		//test001();
	}


	

	


