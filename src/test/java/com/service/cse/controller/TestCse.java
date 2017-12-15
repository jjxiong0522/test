package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCse {

        CseDelegate cseDelegate = new CseDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}