package lesson_11_polymorphism;

public class WebDriverTest {
    public static void main(String[] args) {
        WebDriver driver;

        // Polymorphism
        boolean isTestingOnChrome = System.getenv("browser").equalsIgnoreCase("chrome");

        if (isTestingOnChrome) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.init();

        // Test Logic here
        driver.sendKeys(new WebElement(), "teo");

        driver.close();
    }
}
