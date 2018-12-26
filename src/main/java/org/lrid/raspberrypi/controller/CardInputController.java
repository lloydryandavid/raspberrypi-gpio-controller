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

    @Autowired
    GpioPinDigitalOutput swiper;

    @GetMapping("/test")
    public String index() {
        return "Web Service is running!";
    }

    @GetMapping("/tap/on")
    public String toggleTapOn() {
        tap.setState(PinState.HIGH);
        return "Tapped";
    }

    @GetMapping("/tap/off")
    public String toggleTapOff() {
        tap.setState(PinState.LOW);
        return "Untapped";
    }


    @GetMapping("/chip/on")
    public String toggleChipOn() {
        chip.setState(PinState.HIGH);
        return "Chip in";
    }

    @GetMapping("/chip/off")
    public String toggleChipOff() {
        chip.setState(PinState.LOW);
        return "Chip out";
    }

    @GetMapping("/swipe/on")
    public String toggleSwipeOn() {
        swiper.setState(PinState.HIGH);
        return "Swiped in";
    }

    @GetMapping("/swipe/off")
    public String toggleSwipeOff() {
        swiper.setState(PinState.LOW);
        return "Swiped out";
    }

}
