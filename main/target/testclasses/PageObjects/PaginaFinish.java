package main.target.testclasses.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaFinish {
	
	private WebDriver driver;
	
	public PaginaFinish(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement titulo() {
		return driver.findElement(By.className("subheader"));
	}
	
	public WebElement subTitulo() {
		return driver.findElement(By.className("complete-header"));
	}
}
