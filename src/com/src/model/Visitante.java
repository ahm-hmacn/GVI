package com.src.model;


import java.util.ArrayList;
import java.util.Date;

//classe para criação do objeto visitante
public class Visitante extends Pessoa{
    
    //Atributos
    private String local;
    private String vinculo;
    private String paciente;
    private String nomeMae;
    private String dataEntrada;
    
    //Construtor
    public Visitante(){}
        
    public Visitante(String nome, String dataNascimento, Documento doc, String nomeMae, String paciente, String local, String vinculo, String dataEntrada){
        super (nome, dataNascimento, doc);
        this.nomeMae = nomeMae;
        this.paciente = paciente;
        this.local = local;
        this.vinculo = vinculo;
        this.dataEntrada = dataEntrada;
    }
    
    //gets e sets
    public void setPaciente(String paciente){
        this.paciente = paciente;
    }
    
    public String getPaciente(){
        return paciente;
    }
    
    public void setLocal(String local){
        this.local = local;
    }
    
    public String getLocal(){
        return local;
    }
    
    public void setVinculo(String vinculo){
        this.vinculo = vinculo;
    }
    
    public String getVinculo(){
        return vinculo;
    }
    
    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }
    
    public String getDataEntrada(){
        return dataEntrada;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    
}
