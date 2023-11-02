package br.com.crud.dto;

public class ProductDto {

    private String nome;

    private Long stock;

    private Double price;


    // GETTERs AND SETTERs
    public String getNome(){
        return nome;
    }

    public Long getStock(){
        return stock;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
