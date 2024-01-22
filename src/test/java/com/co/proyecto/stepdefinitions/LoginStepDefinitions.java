package com.co.proyecto.stepdefinitions;

import com.co.proyecto.models.LoginData;
import com.co.proyecto.questions.Validar;
import com.co.proyecto.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.proyecto.userinterfaces.LoginPage.IMG_LOGO;
import static com.co.proyecto.utils.GlobalData.JULIETH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {
    @Given("^Julieth ingresa a sitio (.*)$")
    public void juliethIngresaASitioHttpsTrycontrollerQaAzurewebsitesNet(String url) {
        OnStage.theActorCalled(JULIETH).wasAbleTo(Open.url(url));
    }

    @When("Julieth ingresa sus credenciales")
    public void juliethIngresaSusCredenciales(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onThesite(LoginData.setData(dataTable).get(0))
        );

    }

    @Then("Julieth ve el logo de la empresa")
    public void juliethVeElLogoDeLaEmpresa() {
        OnStage.theActorInTheSpotlight().should(seeThat(Validar.logo(IMG_LOGO)));

    }
}
