package com.joelr.nasapic.controller;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.joelr.nasapic.model.NasaPic;

public class NasaPicController {

    public static String BASE_URL = "https://api.nasa.gov/planetary/apod?api_key=w93h6dyJQr0dI4OIh0bMQtHh3lHxUwYYpbxhjrlL";
    private RestTemplate restTemplate = new RestTemplate();

    public NasaPic getNasaPic(){
       NasaPic nasaPic = null;
       try{
           nasaPic = restTemplate.getForObject(BASE_URL, NasaPic.class);
       } catch (ResourceAccessException e){
           throw new RuntimeException("Could not connect to: " + BASE_URL);         // need to update message and exception type
       } catch (RestClientResponseException e){
           throw new RuntimeException("Error " + e.getRawStatusCode());
       }
       return nasaPic;
   }

}
