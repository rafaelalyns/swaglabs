package src.demo.src.main.java.Framework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import main.target.classe.Framework.Browser.DriverManager;
import main.target.classe.Framework.Browser.TypeBrowser;
import main.target.classe.Framework.Utils.FileOperation;

public class TestBase extends DriverManager {
    private static WebDriver driver;

    private static String URL = FileOperation.getProperties("url").getProperty("index");

    public static WebDriver getDriverManager() {
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }
    @BeforeEach
    public void setUp() {
        getDriverManager().get(URL);
    }
    @AfterEach
    public void finish() {
        quitDriver();
    }
}