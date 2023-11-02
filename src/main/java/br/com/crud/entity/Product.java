package br.com.crud.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product  extends PanacheEntity {

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
