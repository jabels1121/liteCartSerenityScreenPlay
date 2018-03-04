package AdminPageTests;


import AdminPage.Questions.AdminPanelOpened;
import AdminPage.Questions.LoginPageOpened;
import AdminPage.Tasks.Login;
import AdminPage.Tasks.Logout;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@RunWith(SerenityRunner.class)
public class shouldLoginInTheAdminPanelTest {

    Actor bobby = new Actor("Bobby_Admin");

    @Managed
    WebDriver hisBrowser;

    @Before
    public void bobbyCanOpenTheBrowser() {
        bobby.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.get("http://litecart/admin");
        bobby.should(seeThat(LoginPageOpened.opened()));
    }

    @Test
    @Title("Пользователь авторизуется в Admin Panel с валидными данными")
    public void shouldBeAbleToLoginInToAdminPanel() {
        bobby.attemptsTo(
                Login.withCreds("admin", "admin"));

        bobby.should(seeThat(AdminPanelOpened.logoDisplayed()));
    }

    @Test
    @Title("Пользователь авторизуется в Admin Panel с валидными данными и выходит из неё, нажав кнопку Logout")
    public void shouldBeAbleToLogoutFromAdminPanel() {
        bobby.attemptsTo(Login.withCreds("admin", "admin"));

        bobby.should(seeThat(AdminPanelOpened.logoDisplayed()));

        bobby.attemptsTo(Logout.clickLogoutButton());

        bobby.should(seeThat(LoginPageOpened.opened()));
    }


}
