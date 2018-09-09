package com.accenture.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;



public class ScreenShot extends Abc {
	
	@Test
	public void screenShot() throws Exception
	{
		d.get("https://www.timesjobs.com/candidate/register.html");
		File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\ScreenShot\\abc.png"));
		
	}

}
