package com.accenture.tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class Coocies extends Abc {
  @Test
  public void coocies() {
	  
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().deleteAllCookies();
	  Cookie c=new Cookie("User","Tricentis");
	  d.manage().addCookie(c);
	  Set<Cookie> details=d.manage().getCookies();
	  for(Cookie s:details)
	  {
		  System.out.println(s.getExpiry());
		  System.out.println(s.getName());
		  System.out.println(s.getDomain());
		  
	  }
  }
}
