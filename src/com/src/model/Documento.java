package com.src.model;

import java.util.ArrayList;

/**
 *
 * @author x002559
 */
public class Documento {
    //Atributos
    private String numeroDoc;
    private String tipoDoc;
    
    //construtores
    public Documento(){};
    
    public Documento(String numero, String tipo){
        this.numeroDoc = numero;
        this.tipoDoc = tipo;
    }
    
    //getters e setters
    public String getNumeroDoc(){
        return numeroDoc;
    }
    public void setNumeroDoc(String numero){
        this.numeroDoc = numero;
    }
    public String getTipoDoc(){
        return tipoDoc;
    }
    public void setTipoDoc(String tipo){
        this.tipoDoc = tipo;
    }
    
}
