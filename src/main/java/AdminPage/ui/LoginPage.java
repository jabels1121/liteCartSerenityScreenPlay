package AdminPage.ui;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target LOGIN_FIELD = Target.the("Login input field")
            .locatedBy("//input[@name='username']");

    public static final Target PASS_FIELD = Target.the("Password input field")
            .locatedBy("//input[@name='password']");

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("//button[@name='login']");

    public static final Target LOGOTYPE = Target.the("LiteCart logotype")
            .locatedBy("//div[@class='header']//img");
    //1

}