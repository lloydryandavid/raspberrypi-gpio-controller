package org.lrid.raspberrypi.configuration;


import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardInputConfiguration {

    @Bean(name="tap")
    GpioPinDigitalOutput tap() {
        return GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_27, "TAP", PinState.LOW);
    }

    @Bean(name="chip")
    GpioPinDigitalOutput chip() {
        return GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_06, "CHIP", PinState.LOW);
    }

    @Bean(name="swiper")
    GpioPinDigitalOutput swiper() {
        return GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_05, "SWIPE", PinState.LOW);
    }

}
