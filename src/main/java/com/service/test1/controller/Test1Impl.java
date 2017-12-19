package com.service.test1.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-19T06:18:59.268Z")

@RestSchema(schemaId = "test1")
@RequestMapping(path = "/test1", produces = MediaType.APPLICATION_JSON)
public class Test1Impl {

    @Autowired
    private Test1Delegate userTest1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest1Delegate.helloworld(name);
    }

}
