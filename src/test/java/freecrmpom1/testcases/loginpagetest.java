package freecrmpom1.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import freecrmpom1.pages.homepage;
import base.baseclass;
import freecrmpom1.pages.signinpage;

public class loginpagetest extends baseclass {
	signinpage signin;
	homepage homepage;
	public loginpagetest()
	{ super();
	}
	
	
	@BeforeMethod
	public void setup()
	{intialization();
	 signin = new signinpage();
	}
	
	@Test(priority = 1)
	public void signinpagetitle()
	{String title = signin.validatetile();
	System.out.println("Title is :"+title);}
	
	@Test(priority = 3)
	public void crmimgtest()
	
	{
		boolean image = signin.validateimage();
	System.out.println("Image is displayed" +image);
	
	}
	
	@Test(priority = 2)
	public void signinprop()
	{
		homepage =signin.signin(prop.getProperty("username"), "password");
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	}
	

