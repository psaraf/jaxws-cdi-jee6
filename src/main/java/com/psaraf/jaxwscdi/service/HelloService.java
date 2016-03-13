/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psaraf.jaxwscdi.service;

import com.psaraf.jaxwscdi.cdi.CDIBean;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author prashantsaraf
 */
@WebService(name = "HelloServices")
public class HelloService {
    
    @Inject
    CDIBean bean;
    
    @WebMethod
    public String sayHello(String name){
        System.out.println("Bean is injected"+bean);
        
        return "Hello " + name;
    }
}
