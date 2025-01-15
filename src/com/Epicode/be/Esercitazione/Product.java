package com.Epicode.be.Esercitazione;

public class Product {
    protected Long id;
    protected String name;
    protected String category;
    protected double price;


    public Product(Long id, String name, String category, double price){
          this.id = id;
          this.name = name;
          this.category = category;
          this.price = price;
    }
    @Override
    public String toString(){
        return "Prodotto : " + this.name + ", con id numero : " + this.id + " Categoria " + this.category + " Prezzo : " + this.price + "€";
    }


}
