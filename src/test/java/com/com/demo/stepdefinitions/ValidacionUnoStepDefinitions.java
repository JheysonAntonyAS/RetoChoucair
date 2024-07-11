package com.com.demo.stepdefinitions;

import com.com.demo.models.ObtenerTexto;
import com.com.demo.tasks.ElegirProductoAlAzar;
import com.com.demo.tasks.HoverOver;
import com.com.demo.ui.PageExito;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.com.demo.utils.GlobalData.ACTOR;
import static com.com.demo.utils.GlobalData.URLEXITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionUnoStepDefinitions {

    @Given("El usuario ingresa a la pagina")
    public void elUsuarioIngresaALaPagina() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URLEXITO));
    }

    @When("elige una categoria y subcategoria")
    public void eligeUnaCategoriaYSubcategoria() {
        theActorInTheSpotlight().attemptsTo(

                JavaScriptClick.on(PageExito.MENU),
                // Mueve el cursor al menú para mostrar las opciones
                HoverOver.element(PageExito.CATEGORIA),

                // Espera un momento para asegurar que las opciones se han cargado
                WaitUntil.the(PageExito.CATEGORIA, isVisible()).forNoMoreThan(5).seconds(),

                // Mueve el cursor a la categoría para mostrar las subcategorías
                HoverOver.element(PageExito.CATEGORIA),

                // Espera un momento para asegurar que las subcategorías se han cargado
                WaitUntil.the(PageExito.SUBCATEGORIA, isVisible()).forNoMoreThan(5).seconds(),

                // Haz clic en la subcategoría
                JavaScriptClick.on(PageExito.SUBCATEGORIA)
        );
    }

    @When("elige un producto al azar")
    public void eligeUnProductoAlAzar() {

        theActorInTheSpotlight().attemptsTo(
                JavaScriptClick.on(PageExito.AGREGAR),
                WaitUntil.the(PageExito.AGREGAR, isVisible()).forNoMoreThan(10).seconds()
        );

        String textoProducto = theActorInTheSpotlight().asksFor(Text.of(PageExito.TEXTO).asString());
        ObtenerTexto.setCapturarTexto(textoProducto);
    }

    @When("agrega una cantidad aleatoria entre uno y diez")
    public void agregaUnaCantidadAleatoriaEntreUnoYDiez() {
        int numeroDeClicks = PageExito.generarNumeroAleatorioDeClicks();
        // Genera el número aleatorio de clics
        for (int i = 0; i < numeroDeClicks; i++) {
            theActorInTheSpotlight().attemptsTo(
                    // Espera hasta que el producto sea visible
                    JavaScriptClick.on(PageExito.SUMAR));
        }
        theActorInTheSpotlight().attemptsTo(
                JavaScriptClick.on(PageExito.CARRITO_COMPRAS)
        );
    }

    @Then("validara que el nombre del producto debe ser el mismo que muestra el carro")
    public void validaraQueElNombreDelProductoDebeSerElMismoQueMuestraElCarro() {

        String textoOtroElemento = theActorInTheSpotlight().asksFor(Text.of(PageExito.TEXTOCARRO).asString());
        assert (textoOtroElemento).equals(ObtenerTexto.getCapturarTexto());
    }
}
