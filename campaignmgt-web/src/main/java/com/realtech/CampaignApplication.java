package com.realtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pc on 16/03/14.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.realtech")
public class CampaignApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(CampaignApplication.class, args);
    }
}
