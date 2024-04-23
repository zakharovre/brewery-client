package ru.zakharovre.breweryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.zakharovre.breweryclient.web.client.BreweryClient;

@SpringBootApplication
@EnableConfigurationProperties(BreweryClient.class)
public class BreweryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreweryClientApplication.class, args);
    }

}
