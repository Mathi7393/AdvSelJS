package com.crm.VTiger2.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicPractice {
	@Test
	public void method1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/");
		System.out.println("9688603286");
		System.out.println("mathivarman7393@gmail.com");
		Reporter.log("9688603286", true);
		Reporter.log("mathivarman7393@gmail.com", true);
		
	}

}
