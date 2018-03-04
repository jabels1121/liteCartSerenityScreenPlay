package AdminPage.Questions;

import AdminPage.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPageOpened implements Question<Boolean> {

    @Step
    @Override
    public Boolean answeredBy(Actor actor) {
        String selector = LoginPage.LOGOTYPE.getCssOrXPathSelector();
        BrowseTheWeb.as(actor)
                .withTimeoutOf(10, TimeUnit.SECONDS)
                .waitForPresenceOf(By.xpath(selector));
        return BrowseTheWeb.as(actor).isElementVisible(By.xpath(selector));
    }

    public static LoginPageOpened opened() {
        return new LoginPageOpened();
    }
}

