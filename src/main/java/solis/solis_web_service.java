/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package solis;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author Jasiel
 */
@WebService(serviceName = "solis_metodo")
public class solis_web_service {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "solis_garcia_jasiel")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "calcular_velocidad")
    public double calcular_velocidad(@WebParam(name = "distancia") double distancia, @WebParam(name = "tiempo")double tiempo) {
    double velocidad=distancia/tiempo;
    return (double)(velocidad);
    }
    
}
