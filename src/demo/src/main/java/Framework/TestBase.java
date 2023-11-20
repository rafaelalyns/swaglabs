package demo.src.main.java.Framework;

import demo.target.classes.Framework.Browser.DriverManager;
import demo.target.classes.Framework.Browser.TypeBrowser;
import demo.target.classes.Framework.Utils.FileOperation;

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