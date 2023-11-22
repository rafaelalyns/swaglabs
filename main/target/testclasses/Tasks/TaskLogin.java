package main.target.testclasses.Tasks;

import org.openqa.selenium.WebDriver;

import main.target.testclasses.PageObjects.PaginaInicialLogin;
import main.target.testclasses.Validations.ValidacaoLogin;

public class TaskLogin {
	
	 private WebDriver driver;
	 private PaginaInicialLogin paginaLogin;
	 private ValidacaoLogin validacaoLogin;
	 
	 public TaskLogin(WebDriver driver) {
		 this.driver = driver;
		 paginaLogin = new PaginaInicialLogin(this.driver);
	 }
	 
	 public void efetuarLogin() {
		 validacaoLogin.validarPaginaLogin();
		 paginaLogin.campoUser().sendKeys("standard_user");
		 paginaLogin.campoSenha().sendKeys("secret_sauce");
		 paginaLogin.botaoLogin().click();
	 }
}
