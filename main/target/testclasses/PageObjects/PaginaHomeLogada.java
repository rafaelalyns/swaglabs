package main.target.testclasses.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaHomeLogada {
	
	private WebDriver driver;
	
	public PaginaHomeLogada(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement mochilaAddToCart() {
		return driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[1]/div[3]/button"));
	}
	
	public WebElement camisetaLink() {
		return driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
	}
	
	public WebElement precoMochila() {
		return driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[1]/div[3]/div"));
	}
}
