package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exePath = "./Driver/chromedriver.exe"; // especificar la ruta de ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando las propiedades con la ruta del chrome driver 
		WebDriver driver = new ChromeDriver (); // Objetivo de webDriver
		driver.get("https://www.google.com");
		
		
	}

}
