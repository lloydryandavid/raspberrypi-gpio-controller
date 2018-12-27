package org.lrid.raspberrypi.configuration;


import org.lrid.raspberrypi.cardentrymode.TapEntryMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardInputConfiguration {

    @Bean(name="tapEntryMode")
    TapEntryMode tapEntryMode() {
        return new TapEntryMode();
    }

}
