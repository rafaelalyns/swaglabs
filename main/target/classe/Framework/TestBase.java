package main.target.classe.Framework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends main.target.classe.Framework.Browser.DriverManager {
    private static WebDriver driver;

    private static String URL = main.target.classe.Framework.Utils.FileOperation.getProperties("url").getProperty("index");

    public static WebDriver getDriverManager() {
        driver = getDriver(main.target.classe.Framework.Browser.TypeBrowser.CHROME);
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