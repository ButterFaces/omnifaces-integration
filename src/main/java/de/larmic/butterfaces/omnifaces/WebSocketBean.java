package de.larmic.butterfaces.omnifaces;


import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class WebSocketBean implements Serializable {

    public String getTestValue() {
        return "hello world!";
    }

}
