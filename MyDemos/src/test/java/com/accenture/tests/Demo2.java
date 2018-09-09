package com.accenture.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo2 extends Abc {
  @Test
  public void upload() throws Exception {
	  d.get("https://www.timesjobs.com/candidate/register.html");
	  d.findElement(By.id("resumeFile_basic")).click();
	  
	  Robot r=new Robot();
	  Demo2.setClip();
	 // setClip("C:\\SeleniumDrivers\\chromedriver_win32");
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(4000);  
  }
  public static void setClip()
  {
	  StringSelection b=new StringSelection("C:\\SeleniumDrivers\\chromedriver_win32");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(b, null);
  }
}
