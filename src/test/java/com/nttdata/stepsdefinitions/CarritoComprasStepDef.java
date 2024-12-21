package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoComprasStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarritoComprasStepDef {

    @Steps
    CarritoComprasStep carritoComprasStep;

    @Given("estoy en la aplicacion de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carritoComprasStep.validar();
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String unidades, String producto) {
        carritoComprasStep.seleccionarProducto(producto);
        carritoComprasStep.agregarProducto(Integer.parseInt(unidades));
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        carritoComprasStep.validarCarrito();
    }

}
