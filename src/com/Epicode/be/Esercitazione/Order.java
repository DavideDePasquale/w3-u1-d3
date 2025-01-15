package com.Epicode.be.Esercitazione;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
    protected Long id;
    protected String status;
    protected LocalDate orderDate;
    protected LocalDate deliveryDate;
    protected List<Product> products;
    protected Customer customer;


    public Order(Long id, String status, String orderDate, String deliveryDate, List<Product> products, Customer customer){
        this.id= id;
        this.status = status;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.orderDate = LocalDate.parse(orderDate,formatter);
        this.deliveryDate = LocalDate.parse(deliveryDate,formatter);
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Ordine numero : " + this.id + ", status ordine : " + this.status + " ( ordinato il " + this.orderDate + " e consegnato il " + this.deliveryDate + " ), ordine : " + this.products + " acquistato/i da : " + this.customer;
    }
}
