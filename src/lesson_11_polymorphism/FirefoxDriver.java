package lesson_11_polymorphism;

public class FirefoxDriver extends WebDriver{

    @Override
    public void init() {
        System.out.println("Init with FirefoxDriver");
    }

    @Override
    public void close() {
        System.out.println("Close with FirefoxDriver");
    }

    @Override
    public void sendKeys(WebElement element, String chars) {
        System.out.println("Send keys with FirefoxDriver");
    }
}
