package com.accenture.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReadData extends Abc {
 @Test
 public void readData() throws Exception
 {
	 d.get("http://demowebshop.tricentis.com/login"); 
	 FileInputStream fis=new FileInputStream("C:\\Data\\Book1.xls");
	 HSSFWorkbook h=new HSSFWorkbook(fis);
	 HSSFSheet s=h.getSheetAt(0);
	 int rowcount=s.getFirstRowNum();
	 for(int i=1;i<=rowcount;i++)
	 {
	 String uname=s.getRow(i).getCell(0).getStringCellValue();
	// System.out.println(un);
	 String pwd1=s.getRow(i).getCell(1).getStringCellValue();
	// System.out.println(un);
	 loginTest(uname, pwd1);
	 try
	 {
		 d.findElement(By.linkText("Log out")).click();
	 }
	 catch (Exception e)
	 {
		 
	 }
	 } 
	
 }
 @Test
 public void loginTest(String un,String pwd) 
 
 {
	d.get("http://demowebshop.tricentis.com/login"); 
	d.findElement(By.linkText("Log in")).click();
	d.findElement(By.name("Email")).sendKeys(un);
	d.findElement(By.name("Password")).sendKeys(pwd);
	d.findElement(By.xpath("//form/div[5]/input")).click();
	//d.findElement(arg0)
 }
}
