package org.lrid.raspberrypi.cardentrymode;

import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class TapEntryMode {

    private final GpioPinDigitalOutput PIN_27;
    private final GpioPinDigitalOutput PIN_28;

    public TapEntryMode() {
        PIN_27 = GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_27, "CONTROL_VOLTAGE_1", PinState.LOW);
        PIN_28 = GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_28, "CONTROL_VOLTAGE_2", PinState.LOW);
    }

    private void resetPinsToLow() {
        PIN_27.setState(PinState.LOW);
        PIN_28.setState(PinState.LOW);
    }

    public void tapIn() throws Exception{
        resetPinsToLow();
        PIN_27.setState(PinState.HIGH);
        PIN_28.setState(PinState.LOW);
        Thread.sleep(2000);
        resetPinsToLow();
    }

    public void tapOut() throws Exception{
        resetPinsToLow();
        PIN_27.setState(PinState.LOW);
        PIN_28.setState(PinState.HIGH);
        Thread.sleep(2000);
        resetPinsToLow();
    }

}
