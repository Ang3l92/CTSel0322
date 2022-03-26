package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
  @Test
  public void f() {
	  String exePath = "./Driver/chromedriver.exe"; // especificar la ruta de ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando las propiedades con la ruta del chrome driver 
		WebDriver driver = new ChromeDriver (); // Objetivo de webDriver
		driver.get("https://www.google.com");
		
		
  }
}
