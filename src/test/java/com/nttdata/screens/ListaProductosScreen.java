package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaProductosScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement etqProducto;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[1]")
    private WebElement primerProducto;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    private List<WebElement> imgsProductos;

    public boolean productosVisibles(){
        waitFor(ExpectedConditions.visibilityOf(etqProducto));
        waitFor(ExpectedConditions.visibilityOf(primerProducto));
        return etqProducto.isEnabled() && primerProducto.isEnabled();
    }

    public boolean seleccionarImagen(String producto){
        for(WebElement imgProduct : imgsProductos){
            System.out.println(imgProduct.getAttribute("contentDescription"));
            if (imgProduct.getAttribute("contentDescription").equalsIgnoreCase(producto)) {
                imgProduct.click();
                return true;
            }
        }
        return false;
    }

}
