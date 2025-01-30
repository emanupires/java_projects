package com.manu.atividades.models;

//3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.


public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void calculaDesconto(double percentual) {
        double desconto = precoProduto * (percentual / 100);
        precoProduto -= desconto;
    }

    public void informacoesProdutos() {
        System.out.println(nomeProduto);
        System.out.println(precoProduto);
    }

}
