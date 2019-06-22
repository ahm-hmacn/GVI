package com.src.model;


import java.util.Date;

public class Historico {
    
    //Atributos
    private Funcionario responsavel;
    private Date dataAtualizacao;
    private String anotacao;
    
    //Construtor
    public Historico(Funcionario responsavel, Date dataAtualizacao){
        this.responsavel = responsavel;
        this.dataAtualizacao = dataAtualizacao;
    }
    
    //gets e sets
    public void setResponsavel(Funcionario responsavel){
        this.responsavel = responsavel;
    }
    
    public Funcionario getResponsavel(){
        return responsavel;
    }
    
    public void setDataAtualizacao(Date dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }
    
    public Date getDataAtualizacao(){
        return dataAtualizacao;
    }
    
    public void setAnotacao(String anotacao){
        this.anotacao = anotacao;
    }
    
    public String getAnotacao(){
        return anotacao;
    }
}
