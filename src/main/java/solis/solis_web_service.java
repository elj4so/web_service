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
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "calcular_velocidad")
    public double calcular_velocidad(@WebParam(name = "distancia") double distancia, @WebParam(name = "tiempo")double tiempo) {
     double velocidad=distancia/tiempo;
      return (double)(velocidad);
    }
    @WebMethod(operationName = "calcular_hipotenusa")
    public double calcular_hipotenusa(@WebParam(name = "cateto1") double cateto1, @WebParam(name = "cateto2") double cateto2) {
    double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    return hipotenusa;
    }
}
