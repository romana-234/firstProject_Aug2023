package variousConcepts;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// variables /attributes /fields 
       //	method 	

WebDriver driver = new ChromeDriver();

 driver.get("https://www.selenium.dev/");

//scan.close();
	}

}
