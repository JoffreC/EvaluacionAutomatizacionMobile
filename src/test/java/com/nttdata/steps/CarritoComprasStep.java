package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import com.nttdata.screens.ListaProductosScreen;
import com.nttdata.screens.ProductoScreen;
import org.junit.Assert;

public class CarritoComprasStep {
    ListaProductosScreen listaProductosScreen;
    ProductoScreen productoScreen;
    CarritoScreen carritoScreen;

    static String productoSeleccionado;
    static int unidadesProducto;

    public void validar(){

        Assert.assertTrue(listaProductosScreen.productosVisibles());
    }

    public void seleccionarProducto(String producto){
        Assert.assertTrue("El producto no existe ",listaProductosScreen.seleccionarImagen(producto));
    }

    public void agregarProducto(int units){
        productoSeleccionado = productoScreen.validarCargaProducto();
        for(int i = 1; i < units; i++){
            productoScreen.incrementarUnidades();
        }
        unidadesProducto = productoScreen.obtenerUnidades();
        productoScreen.anadirProducto();
        productoScreen.verCarrito();
    }

    public void validarCarrito(){
        Assert.assertEquals("El producto en el carrito no coincide con el seleccionado", productoSeleccionado, carritoScreen.obtenerNombreProductoComprado());
        Assert.assertEquals("Las unidades del producto no coinciden con las seleccionadas", unidadesProducto, carritoScreen.obtenerUnidades());
    }
}
