package org.lrid.raspberrypi.controller;


import com.pi4j.io.gpio.GpioPinDigitalOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CardInputController {

//    @Autowired
//    GpioPinDigitalOutput tap;

    @GetMapping("/test")
    public String index() {
        return "Web Service is running!";
    }

//    @GetMapping("/toggle/pin/tap/on")
//    public String toggleTapOn() {
//        tap.high();
//        return "Tapped";
//    }
//
//    @GetMapping("/toggle/pin/tap/off")
//    public String toggleTapOff() {
//        tap.low();
//        return "Untapped";
//    }

}
