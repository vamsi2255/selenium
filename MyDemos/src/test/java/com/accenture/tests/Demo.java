package com.accenture.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo extends Abc {
	@Test
	public void beforeTest2()
	{
		d.get("http://demowebshop.tricentis.com/");
		Actions a=new Actions(d);
		d.findElement(By.linkText("Log in")).click();
		WebElement txt=d.findElement(By.name("Email"));
		a.moveToElement(txt).keyDown(txt, Keys.SHIFT).sendKeys("myname").build().perform();	
	}
	@Test
	public void beforeTest3() throws Exception
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);		
	}

}
