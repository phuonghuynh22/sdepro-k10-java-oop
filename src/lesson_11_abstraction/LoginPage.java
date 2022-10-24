package lesson_11_abstraction;

public abstract class LoginPage {
    public abstract String inputUsername(String username);
    public abstract String inputPassword(String password);
    public abstract String clickOnLoginBtn();

    public void login(String username, String password){
        inputUsername(username);
        inputPassword(password);
        clickOnLoginBtn();
    }
}
