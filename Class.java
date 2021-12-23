package org.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PS\\eclipse-workspace\\Pro\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	d.manage().window().maximize();
	WebElement element = d.findElement(By.id("month"));
	Select select = new Select(element);
	List<WebElement> options1 = select.getOptions();
	for (int i = options1.size()-1; i <options1.size(); i++) {
		WebElement webElement = options1.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
	}
	}
