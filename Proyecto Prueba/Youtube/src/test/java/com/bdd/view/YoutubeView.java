package com.bdd.view;

import MobileDriverManager.BaseView;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.rules.Timeout;

public class YoutubeView extends BaseView {

    //xpath
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Principal\"]/android.widget.TextView")
    private MobileElement btnYoutube;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Buscar\"]")
    private MobileElement buscar;

    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    private MobileElement editar;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
    private MobileElement seleccionar;

    @AndroidFindBy(id = "com.google.android.youtube:id/search_query")
    private MobileElement detalle;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    private  MobileElement btnMostrar;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]//android.widget.ImageView[1]")
    private MobileElement btnReproducir;
    public void VerificarLaSeccionPrincipal() {
        btnYoutube.isDisplayed();
    }

    public void digitarNombreDeCancion(String cancion) {
        buscar.click();
        editar.sendKeys(cancion);
        Timeout.seconds(5);
        seleccionar.click();

    }

    public void seleccionarCancion() {
        detalle.click();
        btnMostrar.isSelected();
        btnMostrar.click();
        Timeout.seconds(5);

    }

    public void VerificarCancion() {
        btnReproducir.click();
    }
}
