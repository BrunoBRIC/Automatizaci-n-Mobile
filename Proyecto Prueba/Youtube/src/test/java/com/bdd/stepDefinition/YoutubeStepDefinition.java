package com.bdd.stepDefinition;
import com.bdd.step.YoutubeStep;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.net.MalformedURLException;

public class YoutubeStepDefinition {
    private YoutubeStep youtubeStep;
    @Before
    public void beforScenario(){youtubeStep= new YoutubeStep ();}
        @Dado("que inicio la aplicacion de youtube")
    public void queInicioLaAplicacionDeYoutube() throws MalformedURLException {
        youtubeStep.cargarApliacion();
    }

    @Entonces("verifico que muestre la seccion principal Youtube")
    public void verificoQueMuestreLaSeccionPrincipalYoutube() {
        youtubeStep.verificarLaSeccionPrincipal();
    }

    @Dado("que digito el nombre de la cancion  {string} en la caja de busquedas")
    public void queDigitoElNombreDeLaCancionEnLaCajaDeBusquedas(String cancion) {
   youtubeStep.digitarNombreDeCancion(cancion);
    }

    @Cuando("seleccionar el botón buscar")
    public void seleccionarElBotónBuscar() {
        youtubeStep.selecionarCancion();
    }

    @Entonces("verificar que la cancion se muestre  de manera exitosa")
    public void verificarQueLaCancionSeMuestreDeManeraExitosa() {
        youtubeStep.verficarQueMuestreCancion();
    }
}
