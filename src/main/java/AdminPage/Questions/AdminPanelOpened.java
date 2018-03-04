package AdminPage.Questions;

import AdminPage.ui.AdminPanel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AdminPanelOpened implements Question<Boolean> {


    @Override
    @Step("{0} должен увидеть логотип в левом верхнем углу, чтобы удостовериться, что он вошел в Apmin Panel")
    public Boolean answeredBy(Actor actor) {
        String selector = AdminPanel.LOGOTYOE.getCssOrXPathSelector();

        BrowseTheWeb.as(actor)
                .withTimeoutOf(10, TimeUnit.SECONDS)
                .waitForPresenceOf(By.cssSelector(selector));
        return BrowseTheWeb.as(actor).isElementVisible(By.cssSelector(selector));
    }

    public static AdminPanelOpened logoDisplayed() {
        return new AdminPanelOpened();
    }
}
