import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCheckoutOverview {
	
	private WebDriver driver;
	
	public PaginaCheckoutOverview(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement titulo() {
		return driver.findElement(By.className("subheader"));
	}
	
	public WebElement primeiroItem() {
		return driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
	}
	
	public WebElement segundoItem() {
		return driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
	}
	
	public WebElement botaoFinish() {
		return driver.findElement(By.className("btn_action cart_button"));
	}
}
