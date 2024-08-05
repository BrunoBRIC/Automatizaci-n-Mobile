package com.bdd.step;

import MobileDriverManager.MobileDriverManager;
import com.bdd.view.YoutubeView;

import java.net.MalformedURLException;


public class YoutubeStep {
    private YoutubeView youtubeView (){ return new YoutubeView() ;}
    public void cargarApliacion() throws MalformedURLException {
        MobileDriverManager.createAppiumDriver();
    }

    public void verificarLaSeccionPrincipal() {
        youtubeView().VerificarLaSeccionPrincipal();
    }

    public void digitarNombreDeCancion(String cancion) {
        youtubeView().digitarNombreDeCancion(cancion);
    }

    public void selecionarCancion() {
        youtubeView().seleccionarCancion();
    }

    public void verficarQueMuestreCancion() {
        youtubeView().VerificarCancion();
    }
}
