package lesson_11_polymorphism;

public class ChromeDriver extends WebDriver{

    @Override
    public void init() {
        System.out.println("Init with ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("Close with ChromeDriver");
    }

    @Override
    public void sendKeys(WebElement element, String chars) {
        System.out.println("Send keys with ChromeDriver");
    }
}
