package com.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import java.util.concurrent.ThreadLocalRandom;

public class PageExito {

    private static final int randomNumber = generarXPathProductoAleatorio();

    public static Target MENU = Target.the("El menu de opciones").located(By.xpath("//*[@id=\"__next\"]/header/section/div/div[1]/button/div"));
    public static Target CATEGORIA = Target.the("Elegir la categoria").located(By.xpath("//*[@id=\"__next\"]/header/aside/ul/section[2]/div/li[3]/div"));
    public static Target SUBCATEGORIA = Target.the("Elegir la subcategoria").located(By.xpath("//*[@id=\"column-1\"]/li[2]/ul/li[5]/a"));
    public static Target AGREGAR = Target.the("Elegir un producto al azar").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber + "]/article/div[2]/div/button"));
    public static Target SUMAR = Target.the("Sumar varios productos").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber + "]/article/div[2]/div/div[3]/button[2]"));
    public static Target TEXTO = Target.the("Ver el texto del elemento").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber +"]/article/div[1]/a/div[1]/p"));
    public static Target TEXTOCARRO = Target.the("ver el texto del carrito de compras").located(By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[4]/span"));
    public static Target CARRITO_COMPRAS = Target.the("Ir al carro de compras").located(By.xpath("//*[@id=\"__next\"]/header/section/div/div[2]/div[2]/button/span"));




    private static Integer generarXPathProductoAleatorio() {
        int minIndex = 1; // El índice mínimo de los productos
        int maxIndex = 6; // El índice máximo de los productos

        // Generar un número aleatorio entre minIndex y maxIndex
        return ThreadLocalRandom.current().nextInt(minIndex, maxIndex + 1);
    }

    public static int generarNumeroAleatorioDeClicks() {
        int minClicks = 1; // El número mínimo de clics
        int maxClicks = 10; // El número máximo de clics
        // Generar un número aleatorio entre minClicks y maxClicks
        return ThreadLocalRandom.current().nextInt(minClicks, maxClicks + 1);
    }


}
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[1]/article/div[2]/div/div[3]/button[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[1]/article/div[2]/div/div[3]/button[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[2]/article/div[2]/div/div[2]/button[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + generarXPathProductoAleatorio() + "]/article/div[2]/div/div[3]/button[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + generarXPathProductoAleatorio() + "]/article/div[2]/div/div[3]/button[2]/svg
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[3]/article/div[2]/div/div[3]/button[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[3]/article/div[2]/div/div[3]/button[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[3]/article/div[2]/div/div[3]/button[2]


//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[4]/article/div[2]/div/button
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[4]/article/div[2]/div/div[3]/button[2]

//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[9]/article/div[2]/div/div[2]/button[2]/svg
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + generarXPathProductoAleatorio() + "]/article/div[2]/div/div[3]/button[2]/svg/use



//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[1]/article/div[1]/a/div[1]/p
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[2]/article/div[1]/a/div[1]/p


//*[@id="render-store.custom.checkout-io"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[4]/span
//*[@id="render-store.custom.checkout-io"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[4]/span