package com.src.model;


import java.util.ArrayList;
import java.util.Date;

//base abstrata para criação das classes funcionário e visitante
public abstract class Pessoa {
    
    //Atributos BASE
    private String nome;    
    private Documento doc;
    private String  dataNascimento;
    
    //Construtores
    public Pessoa(String nome, String dataNascimento, Documento documento) {
        this.nome = nome;  
        this.doc = documento;
        this.dataNascimento = dataNascimento;
    }
    public Pessoa() {}
    
    //Gets e Sets
    public void setName(String nome){
        this.nome = nome;
    }
    
    public String getName(){
        return nome;
    }  
           
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }      
}
