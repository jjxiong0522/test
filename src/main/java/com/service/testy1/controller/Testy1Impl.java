package com.service.testy1.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-19T06:28:38.817Z")

@RestSchema(schemaId = "testy1")
@RequestMapping(path = "/testy1", produces = MediaType.APPLICATION_JSON)
public class Testy1Impl {

    @Autowired
    private Testy1Delegate userTesty1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTesty1Delegate.helloworld(name);
    }

}
