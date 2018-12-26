package org.lrid.raspberrypi.controller;


import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CardInputController {

    @Autowired
    GpioPinDigitalOutput tap;

    @Autowired
    GpioPinDigitalOutput chip;

    @GetMapping("/test")
    public String index() {
        return "Web Service is running!";
    }

    @GetMapping("/toggle/pin/tap/on")
    public String toggleTapOn() {
        tap.setState(PinState.HIGH);
        return "Tapped";
    }

    @GetMapping("/toggle/pin/tap/off")
    public String toggleTapOff() {
        tap.setState(PinState.LOW);
        return "Untapped";
    }


    @GetMapping("/toggle/pin/chip/on")
    public String toggleChipOn() {
        chip.setState(PinState.HIGH);
        return "Chip in";
    }

    @GetMapping("/toggle/pin/chip/off")
    public String toggleChipOff() {
        chip.setState(PinState.LOW);
        return "Chip out";
    }

}
