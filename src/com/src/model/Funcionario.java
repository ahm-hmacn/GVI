package com.src.model;


import java.util.ArrayList;
import java.util.Date;

//classe para a criação do objeto funcionário
public class Funcionario extends Pessoa{
    
    //atributos
    private String usuario;
    private String senha;
    private String periodo;
    
    //Construtor
    public Funcionario(String nome, String dataNascimento, Documento doc, String usuario, String senha, String periodo){
        super (nome, dataNascimento, doc);
        this.usuario = usuario;
        this.periodo = periodo;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
