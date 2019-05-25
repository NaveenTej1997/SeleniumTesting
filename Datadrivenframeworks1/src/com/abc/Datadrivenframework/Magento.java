package com.abc.Datadrivenframework;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Naveen Teja\\eclipse-workspace\\selenium\\Datadrivenframeworks1\\src\\com\\abc\\utilities\\DataDriven.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String nurl = p.getProperty("url");
		String nemail = p.getProperty("email");
		String npass = p.getProperty("password");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(nurl);
		driver.findElement(By.linkText("linktext")).click();;
		driver.findElement(By.id("email")).sendKeys(nemail);
		driver.findElement(By.id("pass")).sendKeys(npass);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("logout")).click();
		driver.quit();
	}

}
