package com.service.test1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest1 {

        Test1Delegate test1Delegate = new Test1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}