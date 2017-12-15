package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T06:58:56.561Z")

@RestSchema(schemaId = "cse")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class CseImpl {

    @Autowired
    private CseDelegate userCseDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseDelegate.helloworld(name);
    }

}
