package main.target.testclasses.Testes;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import main.target.classe.Framework.TestBase;
import main.target.testclasses.Tasks.TaskLogin;

public class FluxoDeCompraCompleto extends TestBase{
	
	private WebDriver driver = getDriverManager();
	private TaskLogin taskLogin;

	@Test
	public void fluxoCompletoDeCompra() {
		taskLogin.efetuarLogin();
	}
}
