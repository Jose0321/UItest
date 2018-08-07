package com.jose.autotest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
//	App app = new App();
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", getClass().getResource("/chromedriver.exe").getPath());
	  System.out.println("ssss:"+getClass().getResource("/chromedriver.exe"));
	  WebDriver dr = new ChromeDriver();
	  dr.get("http://www.baidu.com");
	  
	  App.printhello();
	  System.out.println("aaaaaaaaaa");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  dr.close();
  }
  @AfterMethod
  public void afterMethod() {
  }

}
