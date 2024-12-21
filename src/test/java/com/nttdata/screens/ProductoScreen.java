package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement etqProducto;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement unidades;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnIncremento;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAnadircarrito;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCarrito;

    public String validarCargaProducto(){
        waitFor(etqProducto);
        return etqProducto.getText();
    }

    public void incrementarUnidades(){
        btnIncremento.click();
    }

    public void anadirProducto(){
        btnAnadircarrito.click();
    }

    public void verCarrito(){
        btnCarrito.click();
    }

    public int obtenerUnidades(){
        return Integer.parseInt(unidades.getText());
    }



}
