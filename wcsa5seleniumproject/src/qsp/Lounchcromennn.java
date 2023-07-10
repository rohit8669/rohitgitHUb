package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lounchcromennn {
public static void main(String[] args) throws InterruptedException {
	WebDriver rr=new ChromeDriver();
	rr.get("https://www.youtube.com/");
	
	String currenturl=rr.getCurrentUrl();
	System.out.println(currenturl);
}
}
