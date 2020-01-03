package freecrmpom1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseclass;

public class signinpage extends baseclass {

	//pagefactory or Object repository
	@FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement signinbtn;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//img[@href='/images/cogtiny1.jpg']")
	WebElement crmimg;
	
	public signinpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatetile()
	{
		return driver.getTitle();
	}
	
	public boolean validateimage()
	{
		return crmimg.isDisplayed();
	}
	
	public homepage signin(String un,String pwd)
	{signinbtn.click();
		email.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
	 return new homepage();
	}
		
	}


