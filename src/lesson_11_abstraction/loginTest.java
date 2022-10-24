package lesson_11_abstraction;

public class loginTest {
    public static void main(String[] args) {
        new LoginTestFlow().login(new InternalLoginPage(), "username", "password");
        new LoginTestFlow().login(new ExternalLoginPage(), "username", "password");

    }
}
