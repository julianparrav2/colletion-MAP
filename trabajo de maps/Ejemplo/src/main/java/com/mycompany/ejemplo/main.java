/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo;


import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Kedars
 */
public class main {
    public static void main (String[] args){
        
        PersonasDatos persona = new PersonasDatos();
        persona.setNombre("Juan");
        persona.setCedula(15532966);
        
        
        PersonasDatos persona2 = new PersonasDatos();
        persona2.setNombre("Kevin");
        persona2.setCedula(1005468796);
        
        
        Celular celular = new Celular();
        celular.setMarca("Xiaomi");
        celular.setNumero(321327558);
        
        
        Celular celular2 = new Celular();
        celular2.setMarca("Samsung");
        celular2.setNumero(317872145);
        
        Map <Integer,Integer> mapa = new TreeMap <Integer,Integer> ();
        //aca se usa el put
        mapa.put(persona.getCedula(),celular.getNumero());
        mapa.put(persona2.getCedula(),celular2.getNumero());
        System.out.println("Aca se usa el metodo get, primero siendo falso y despues posivito");
        System.out.println("por ejemplo, para verificar que dicha cedula tiene telefono movil en esta empresa");
        System.out.println(mapa.get(5165154));
        System.out.println("aca es verdadero");
        System.out.println(mapa.get(1005468796));
        System.out.println("Aca se usa el metodo containsvalue, para verificar que cedula posee ese numero, primero falso despues verdadero");
        System.out.println(mapa.containsValue(541265651));
        System.out.println(mapa.containsValue(321327558));
        System.out.println("Aca se usa el metodo key set, para saber que cedulas estan inscritas en la empresa");
        System.out.println(mapa.keySet());    
        System.out.println("Aca se usa el metodo values, para saber que numeros estan inscritos en la empresa");
        System.out.println(mapa.values());
        System.out.println("Aca se usa el metodo size, para conocer cuantas unidades inscritas hay");
        System.out.println(mapa.size());
        System.out.println("Aca se usa el metodo remove, para eliminar a alguien que se desucribio al servicio, la clave");
        System.out.println("este es el numero de celular removido");
        System.out.println(mapa.remove(1005468796));
        System.out.println("Aca se usa el metodo clear, para limpiar el mapa");
        mapa.clear();
        System.out.println("si quiero imprimir alguno de los datos de arriba no se podra por que se limpio el mapa, vacio");
        System.out.println(mapa.keySet());    



        
        



        
        
        
    }
}
