package main.target.testclasses.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaCarrinho {
	
	private WebDriver driver;
	
	public PaginaCarrinho(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement tituloPagina() {
		return driver.findElement(By.className("subheader"));
	}
	
	public WebElement primeiroItem() {
		return driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
	}
	
	public WebElement segundoItem() {
		return driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
	}
	
	public WebElement botaoRemove() {
		return driver.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/button"));
	}
	
	public WebElement botaoCheckout() {
		return driver.findElement(By.className("btn_action checkout_button"));
	}
}
