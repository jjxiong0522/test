package com.service.testy2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTesty2 {

        Testy2Delegate testy2Delegate = new Testy2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testy2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}