package lesson_11_abstraction;

public class InternalLoginPage extends LoginPage{
    @Override
    public String inputUsername(String username) {
        System.out.println("Input username with Internal Login Page");
        return null;
    }

    @Override
    public String inputPassword(String password) {
        System.out.println("Input password with Internal Login Page");
        return null;
    }

    @Override
    public String clickOnLoginBtn() {
        System.out.println("Click on Login Btn with Internal Login Page");
        return null;
    }
}
