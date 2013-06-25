package com.sgcib.currencyconverter;

import com.sgcib.currencyconverter.converter.ConverterResource;
import com.sgcib.currencyconverter.server.ServerResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;

import javax.ws.rs.ApplicationPath;

import static org.glassfish.jersey.servlet.ServletProperties.*;


@ApplicationPath("/")
public class Server extends ResourceConfig {

    public Server() {
        register(JacksonFeature.class);
        register(ServerResource.class);
        register(ConverterResource.class);
//        property(FILTER_FORWARD_ON_404,true);
    }

}

