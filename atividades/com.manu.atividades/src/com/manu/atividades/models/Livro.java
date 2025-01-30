package com.manu.atividades.models;

//5. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class Livro {
    private String titulo;
    private String autor;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void carregaInformacoes() {
        System.out.println("O nome do livro é: " + titulo);
        System.out.println("O autor do livro é: " + autor);
    }
    

}
