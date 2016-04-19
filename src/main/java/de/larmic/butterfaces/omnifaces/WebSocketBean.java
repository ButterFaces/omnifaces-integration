package de.larmic.butterfaces.omnifaces;


import org.omnifaces.cdi.Push;
import org.omnifaces.cdi.PushContext;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class WebSocketBean implements Serializable {

    private String message;

    @Inject
    @Push
    private PushContext someChannel;

    public void setMessage(String message) {
        this.message = message;
        someChannel.send(message);
    }

    public String getMessage() {
        return message;
    }

}
