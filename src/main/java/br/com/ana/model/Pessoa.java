package br.com.ana.model;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {

    private String nome;

    private Integer idade;

    private String cidade;

    private List<String> hobbies = new ArrayList<>();
    

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;

        
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {

        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
    public void adicionarHobby(String hobby) {
        this.hobbies.add(hobby);
    }
}
