package ru.zakharovre.breweryclient.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import ru.zakharovre.breweryclient.web.model.BeerDto;

import java.util.UUID;

@Component
@ConfigurationProperties(prefix = "zre.brewery", ignoreUnknownFields = false)
public class BreweryClient {

    public final String BEER_PATH_V1 = "/api/v1/beer";
    private final RestClient restClient;
    private String apihost;



    public void setApihost(String apihost) {
        this.apihost = apihost;
    }

    public BeerDto getBeerById(UUID uuid) {
        return restClient.get().
        return restClient.get(apihost + BEER_PATH_V1 + uuid, BeerDto.class);
    }
}
