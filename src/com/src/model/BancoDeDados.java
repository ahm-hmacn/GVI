/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.model;

//Importações
import com.mongodb.BasicDBObject;
import com.mongodb.ConnectionString;
import com.mongodb.client.*;
import com.mongodb.ServerAddress;
import com.mongodb.Block;
import com.mongodb.ClientSessionOptions;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Projections;
import org.bson.Document;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.bson.conversions.Bson;
import com.mongodb.Block;
import com.mongodb.DBObject;
 import com.mongodb.client.MongoClients;
 import com.mongodb.client.MongoClient;
 import com.mongodb.client.MongoCollection;
 import com.mongodb.client.MongoDatabase;

 import com.mongodb.client.model.Indexes;
 import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.*;
 import com.mongodb.client.model.Sorts;
 import com.mongodb.client.model.TextSearchOptions;
 import com.mongodb.client.model.Projections;
import java.util.regex.Pattern;
 import org.bson.Document;

/**
 *
 * @author Administrador
 */
public class BancoDeDados {
    
    //atributos
    private MongoDatabase database;
    private Document documento;
    private MongoCollection<BasicDBObject> collection1;
    private MongoCollection<Document> collection;
    private MongoClient DB;
    /*private Block<Document> printBlock = new Block<Document>() {
        @Override
        public void apply(final Document t) {
            System.out.println(t.toJson());            
        }
    };*/
    private Consumer<Document> printBlock = new Consumer<Document>() {
        @Override
        public void accept(Document t) {
            System.out.println(documento.toJson());
        }
    };
    
    //construtor
    public BancoDeDados(){}
    
    public void iniciar(){
        DB = MongoClients.create("mongodb://localhost:27017");
    }
    
    public Document inserir(Visitante visitante){
        database = DB.getDatabase("Visitante");
        Document documento = new Document("Nome", visitante.getName())
                .append("Data de Nascimento", visitante.getDataNascimento())
                .append("Documento", visitante.getDoc().getNumeroDoc())
                .append("Tipo", visitante.getDoc().getTipoDoc())
                .append("Nome da Mãe", visitante.getNomeMae())
                .append("Paciente", visitante.getPaciente())
                .append("Local", visitante.getLocal())
                .append("Vínculo", visitante.getVinculo())
                .append("Data de Entrada", visitante.getDataEntrada());
        return documento;
    }
    public Document inserirFuncionario(Funcionario funcionario){
        database = DB.getDatabase("Funcionario");
        Document documento = new Document("Nome", funcionario.getName())
                .append("Data de Nascimento", funcionario.getDataNascimento())
                .append("Documento", funcionario.getDoc().getNumeroDoc())
                .append("Tipo", funcionario.getDoc().getTipoDoc())
                .append("Usuário", funcionario.getUsuario())
                .append("Senha", funcionario.getSenha())
                .append("Período", funcionario.getPeriodo());
        return documento;
    }
    
    public void Add(Document doc){
        collection = database.getCollection("Visitante");
        collection.insertOne(doc);
    }
    
    public void AddFuncionario(Document doc){
        collection = database.getCollection("Funcionario");
        collection.insertOne(doc);
    }
    
    public Document buscaNome(String nome){
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        Document busca = new Document("Nome", nome);
        Object encontrado = collection.find(busca).first();
        return (Document)encontrado;
    }
    
    public FindIterable<Document> buscaNome2(String nome){
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        FindIterable<Document> busca = collection.find(Filters.regex("Nome", Pattern.quote(nome)));
        return busca;
    }
    
    public Document buscaDoc(String doc){
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        Document busca = new Document("Documento", doc);
        Object encontrado = collection.find(busca).first();
        return (Document)encontrado;
    }
    
    public Document buscaDocFunc(String doc){
        database = DB.getDatabase("Funcionario");
        collection = database.getCollection("Funcionario");
        Document busca = new Document("Documento", doc);
        Object encontrado = collection.find(busca).first();
        return (Document)encontrado;
    }
    
    public Document validacaoFuncionario(String usuario, String senha){
        database = DB.getDatabase("Funcionario");
        collection = database.getCollection("Funcionario");
        Document busca = new Document("Usuário", usuario)
                .append("Senha", senha);
        Object encontrado = collection.find(busca).first();
        encontrado.toString();
        return (Document)encontrado;
    }
    
}