package main.target.testclasses.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaCheckout {
	
	private WebDriver driver;
	
	public PaginaCheckout(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement firstName() {
		return driver.findElement(By.id("first-name"));
	}
	
	public WebElement lastName() {
		return driver.findElement(By.id("last-name"));
	}
	
	public WebElement postalCode() {
		return driver.findElement(By.id("postal-code"));
	}
	
	public WebElement botaoContinue() {
		return driver.findElement(By.className("btn_primary cart_button"));
	}
}
