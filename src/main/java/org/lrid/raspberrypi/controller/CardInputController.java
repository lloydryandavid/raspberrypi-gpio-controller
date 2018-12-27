package org.lrid.raspberrypi.controller;


import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import org.lrid.raspberrypi.cardentrymode.TapEntryMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CardInputController {

    @Autowired
    TapEntryMode tapEntryMode;


    @GetMapping("/test")
    public String index() {
        return "Web Service is running!";
    }

    @GetMapping("/tap-in")
    public String tapIn() throws Exception{
        tapEntryMode.tapIn();
        return "Card tapped-in";
    }

    @GetMapping("/tap-out")
    public String tapOut() throws Exception{
        tapEntryMode.tapOut();
        return "Card tapped-out";
    }

}
