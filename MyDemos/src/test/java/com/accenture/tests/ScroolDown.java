package com.accenture.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScroolDown extends Abc {
	@Test
	public void scroolDown() throws Exception {
		
		d.get("https://www.timesjobs.com/candidate/register.html");
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scroll(0,800)");
		j.executeScript("alert('Hi')");
		Thread.sleep(3000);	
	}

}
