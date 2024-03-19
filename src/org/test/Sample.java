package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		List<WebElement> tableCount = driver.findElements(By.tagName("table"));
		System.out.println(tableCount.size());
		
		//locate the table
		WebElement table = driver.findElement(By.id("customers"));
		
		//To find the tableRow count
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		System.out.println(tableRows.size());
		
		//To find the tableHeading count
		List<WebElement> tableHeadings = table.findElements(By.tagName("th"));
		System.out.println(tableHeadings.size());
		
		//To find the tableData count
		List<WebElement> tableData = table.findElements(By.tagName("td"));
		System.out.println(tableData.size());
		
		//To iterate a particular row data
		List<WebElement> rowData = tableRows.get(1).findElements(By.tagName("td"));
		
		for (int i = 0; i < rowData.size(); i++) {
			
			String data = rowData.get(i).getText();
			System.out.println(data);
		}
		
		
		//To iterate all the row data 
		for (int i = 0; i < tableRows.size(); i++) {
			
			List<WebElement> finalData = tableRows.get(i).findElements(By.tagName("td"));
		
				for (int j = 0; j < finalData.size(); j++) {
					
					System.out.println(finalData.get(j).getText());
				}
		}
		
		
		
		
		
		
		
		
	
	}	

}
