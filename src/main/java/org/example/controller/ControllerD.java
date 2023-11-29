package org.example.controller;

import org.example.annotation.CustomAnnotation;
import org.example.annotation.CustomAnnotation.Autowired;
import org.example.annotation.CustomAnnotation.Controller;

@Controller
public class ControllerD {

    ControllerB controllerB;

    @Autowired
    public ControllerD(ControllerB controllerB) {
        this.controllerB = controllerB;
    }

    public ControllerB getControllerB() {
        return controllerB;
    }

    public void setControllerB(ControllerB controllerB) {
        this.controllerB = controllerB;
    }
}
