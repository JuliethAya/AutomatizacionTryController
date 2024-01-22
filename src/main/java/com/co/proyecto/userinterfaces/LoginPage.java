package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USER = Target.the("usuario")
            .locatedBy("//input[@id='email']");
    public static final Target TXT_PASS = Target.the("pass")
            .locatedBy("//input[@id='Password']");
    public static final Target BTN_LOGIN = Target.the("boton login")
            .locatedBy("//button[@id='m_login_signin_submit']");
    public static final Target IMG_LOGO = Target.the("logo empresa")
            .locatedBy("//img[@src='../../../Images/LogoMenuVertical.jpg']");
}
