package AdminPage.Tasks;

import AdminPage.ui.AdminPanel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Logout implements Task{


    @Override
    @Step("{0} нажимает кнопку Logout из Admin Panel")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AdminPanel.LOGOUT_BUTTON)
        );
    }


    public static Performable clickLogoutButton() {
        return new Logout();
    }
}
