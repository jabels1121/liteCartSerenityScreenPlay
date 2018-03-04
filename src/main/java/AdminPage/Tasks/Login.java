package AdminPage.Tasks;

import AdminPage.ui.LoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;


public class Login implements Task {

    private String login;
    private String password;

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }


    @Override
    @Step("{0} вводит учётные данные в поля логина и пароля и нажимает кнопку Login")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(login).into(LoginPage.LOGIN_FIELD),
                Enter.theValue(password).into(LoginPage.PASS_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );

    }

    public static Performable withCreds(String login, String password) {
        return Instrumented.instanceOf(Login.class).withProperties(login, password);
    }
}
