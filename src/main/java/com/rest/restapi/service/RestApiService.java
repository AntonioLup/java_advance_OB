package com.rest.restapi.service;

import com.rest.restapi.models.RestApi;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RestApiService {
    private final List<RestApi> restapis = new ArrayList();
    public List<RestApi> getAll(){
        return restapis;
    }
    public void add(RestApi restapi){
        restapis.add(restapi);
    }
}
