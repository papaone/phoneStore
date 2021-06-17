package com.example.phoneStore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.phoneStore")
public class SpringConfig {

    @Bean
    public LowCostPhoneModel lowCostPhoneModel() {
        return new LowCostPhoneModel();
    }

    @Bean
    public MidCostPhoneModel midCostPhoneModel() {
        return new MidCostPhoneModel();
    }

    @Bean
    public Phone lowCostPhone() {
        return new Phone(lowCostPhoneModel());
    }

    @Bean
    public Phone midCostPhone() {
        return new Phone(midCostPhoneModel());
    }

}
