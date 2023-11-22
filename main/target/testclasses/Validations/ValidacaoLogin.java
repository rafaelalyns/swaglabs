package main.target.testclasses.Validations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import main.target.testclasses.PageObjects.PaginaInicialLogin;

public class ValidacaoLogin {
	
	private WebDriver driver;
	private PaginaInicialLogin paginaLogin;
	
	public ValidacaoLogin(WebDriver driver) {
		this.driver = driver;
		paginaLogin = new PaginaInicialLogin(this.driver);
	}
	
	public void validarPaginaLogin() {
		Assertions.assertAll("Validar está no login",
				() -> assertTrue(paginaLogin.campoUser().isDisplayed(), "Campo user não está visível"),
				() -> assertTrue(paginaLogin.campoSenha().isDisplayed(), "Campo senha não está visível"),
				() -> assertTrue(paginaLogin.botaoLogin().isDisplayed(), "Botão login não está visível"),
				() -> assertTrue(paginaLogin.cabecalho().isDisplayed(), "Cabeçalho não está visível"));
	}
}
