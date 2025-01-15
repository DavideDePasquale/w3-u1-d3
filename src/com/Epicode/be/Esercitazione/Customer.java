package com.Epicode.be.Esercitazione;

public class Customer {
    protected Long id;
    protected String name;
    protected Integer tier;

    public Customer(Long id, String name, Integer tier){
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Cliente : " + this.name + ", con id numero : " + this.id + " è un cliente di livello : " + this.tier;
    }
}
