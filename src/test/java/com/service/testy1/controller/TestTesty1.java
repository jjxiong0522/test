package com.service.testy1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTesty1 {

        Testy1Delegate testy1Delegate = new Testy1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testy1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}