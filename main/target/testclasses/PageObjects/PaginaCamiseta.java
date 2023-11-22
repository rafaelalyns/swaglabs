package main.target.testclasses.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaCamiseta {
	
	private WebDriver driver;
	
	public PaginaCamiseta(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement titulo() {
		return driver.findElement(By.xpath("//*[@id='inventory_item_container']/div/div/div/div[1]"));
	}
	
	public WebElement preco() {
		return driver.findElement(By.xpath("//*[@id='inventory_item_container']/div/div/div/div[3]"));
	}
	
	public WebElement botaoAddToCart() {
		return driver.findElement(By.className("btn_primary btn_inventory"));
	}
	
	public WebElement carrinho() {
		return driver.findElement(By.className("svg-inline--fa fa-shopping-cart fa-w-18 fa-3x "));
	}
}
