package com.co.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validar implements Question<Boolean>{


    Target elemento;

    public Validar(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return elemento.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> logo(Target elemento){
        return new Validar(elemento);
    }
}
