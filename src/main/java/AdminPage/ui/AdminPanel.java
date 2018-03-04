package AdminPage.ui;

import net.serenitybdd.screenplay.targets.Target;


public class AdminPanel {

    public static final Target LOGOTYOE = Target.the("Logo on the top left sidebar in the Admin Page")
            .locatedBy("div#logotype img");

    public static final Target LOGOUT_BUTTON = Target.the("Logout button")
            .locatedBy("//a[@title='Logout']");

}
