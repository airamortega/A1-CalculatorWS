/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "calc")
@Stateless()
public class calc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1+n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public int resta(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1-n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mul")
    public int mul(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1*n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public double div(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2) {
        //TODO write your implementation code here:
        return n1/n2;
    }

    
}
