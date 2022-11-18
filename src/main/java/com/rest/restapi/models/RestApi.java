package com.rest.restapi.models;

public class RestApi {
    private String nombre;

    public RestApi() {}
    public RestApi(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
}
