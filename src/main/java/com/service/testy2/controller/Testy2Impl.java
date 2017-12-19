package com.service.testy2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-19T06:50:37.912Z")

@RestSchema(schemaId = "testy2")
@RequestMapping(path = "/testy2", produces = MediaType.APPLICATION_JSON)
public class Testy2Impl {

    @Autowired
    private Testy2Delegate userTesty2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTesty2Delegate.helloworld(name);
    }

}
