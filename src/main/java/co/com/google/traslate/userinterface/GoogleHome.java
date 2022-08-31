package co.com.google.traslate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleHome {
    public  static final Target MENUOPTS = Target.the("menu").
            locatedBy("//div[@id=\"gbwa\"]");
    public  static final Target GOOGLE_TRASLATE = Target.the("traductor").
            locatedBy("(//a[@class=\"tX9u1b\"])[13]");
}


        //(//li[@class="j1ei8c"])[13]