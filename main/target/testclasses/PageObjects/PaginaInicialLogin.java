package main.target.testclasses.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicialLogin {
	
	private WebDriver driver;
	
	public PaginaInicialLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement campoUser() {
		return driver.findElement(By.id("user-name"));
	}
	
	public WebElement campoSenha() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement botaoLogin() {
		return driver.findElement(By.id("login-button"));
	}
	
	public WebElement cabecalho() {
		return driver.findElement(By.className("login_logo"));
	}
}
