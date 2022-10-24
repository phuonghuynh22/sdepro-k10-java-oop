package lesson_11_polymorphism;

public abstract class WebDriver {
    public abstract void init();
    public abstract void close();

    public abstract void sendKeys(WebElement element, String chars);
}
