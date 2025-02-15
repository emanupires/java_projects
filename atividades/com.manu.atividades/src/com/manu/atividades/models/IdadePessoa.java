package com.manu.atividades.models;

//2. Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if(idade >= 18 && idade<120) {
           System.out.println("É maior de idade.");
        }
        else if(idade<18 && idade>0) {
            System.out.println("É menor de idade.");
        }
        else {
            System.out.println("Insira uma idade válida.");
        }
    } 

}
