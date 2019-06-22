package com.src.model;


import java.util.ArrayList;
import java.util.Date;

//classe para a criação do objeto funcionário
public class Funcionario extends Pessoa{
    
    //atributos
    private String periodo;
    private String senha;
    
    //Construtor
    public Funcionario(String nome, String dataNascimento, Documento doc, String periodo, String senha){
        super (nome, dataNascimento, doc);
        this.periodo = periodo;
        this.senha = senha;
    }
    
    //Gets e Sets
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
    
    public String getPeriodo(){
        return periodo;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
}
