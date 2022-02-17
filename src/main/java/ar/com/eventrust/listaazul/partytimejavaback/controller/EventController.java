package ar.com.eventrust.listaazul.partytimejavaback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/mock")
    public String foo() {
        return "Hola pepe";
    }
}
