package com.com.demo.tasks;

import com.com.demo.ui.PageExito;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.com.demo.ui.PageExito.AGREGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElegirProductoAlAzar implements Task {

    @Step("{0} elige un producto al azar")
    public <T extends Actor> void performAs(T actor) {
        /*ListOfWebElementFacades elementos = AGREGAR.resolveAllFor(actor);

        //int indiceAleatorio = new Random().nextInt(elementos.size());
        WebElement elementoAleatorio = elementos.get(indiceAleatorio);
        AGREGAR.click(); // Hacer click directamente en el WebElement*/
    }

    public static ElegirProductoAlAzar deLaLista() {
        return instrumented(ElegirProductoAlAzar.class);
    }
}