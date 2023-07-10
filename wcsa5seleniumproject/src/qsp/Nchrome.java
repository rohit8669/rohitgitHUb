package qsp;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Nchrome {
public static void main(String[] args) throws InterruptedException  {
	Scanner sc=new Scanner(System.in);
	System.out.println("which browser ");//how to get throws InterruptedException
	String browservalue=sc.next();
	if(browservalue.equalsIgnoreCase("chrome"));
	{         WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);// click on sleep get theows InterruptedException
	driver.close();
	}
}
}
