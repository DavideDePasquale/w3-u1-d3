package com.Epicode.be.Esercitazione;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Catalogo {
    public static void main(String[] args) {


        // mi credo i prodotti in vendita
        Product prodotto = new Product(1L,"Shrek miniatura", "Baby",20.50);
        Product prodotto1 = new Product(2L, "Goku miniatura","Baby",30.49);
        Product prodotto2 = new Product(3L, "Pallone", "Boys", 10.50);
        Product prodotto3 = new Product(4L,"Serie Libri Harry Potter", "Books", 151.99);
        Product prodotto4 = new Product(5L,"Libro Del Piero", "Books", 101.99);
        Product prodotto5 = new Product(6L,"Libro Emis Killa", "Books", 20.00);
        Product prodotto6 = new Product(7L,"Libro Harry Potter", "Books", 51.99);
        Product prodotto7 = new Product(8L,"Libro Ricette cucina", "Books", 34.99);
        Product prodotto8 = new Product(9L,"Barbie", "Girl", 19.99);
        Product prodotto9 = new Product(10L,"Ken", "Girl", 9.99);
        Product prodotto10 = new Product(11L,"4 Birre Peroni", "Boys", 3.00);
        Product prodotto11 = new Product(12L,"Tavolo Ping Pong", "Baby", 149.99);
        Product prodotto12 = new Product(13L,"Racchetta Padel Uomo Nike","Boys", 170.00);
        Product prodotto13 = new Product(14L,"Racchetta Padel Donna Nike", "Girl", 175.00);
        // creo una lista di prodotti
        List<Product> listaProdotti = Arrays.asList(prodotto,prodotto1,prodotto2,prodotto3,prodotto4,prodotto5,prodotto6,prodotto7,prodotto8,prodotto9,prodotto10,prodotto11,prodotto12,prodotto13);


        // creo una lista di prodotti acquistati da un determinato cliente
        List<Product> prodottiAcqOrd1 = Arrays.asList(prodotto,prodotto1);
        List<Product> prodottiAcqOrd2 = Arrays.asList(prodotto2,prodotto12);
        List<Product> prodottiAcqOrd3 = Arrays.asList(prodotto11);
        List<Product> prodottiAcqOrd4 = Arrays.asList(prodotto4,prodotto7);


        Customer cliente = new Customer(13486L, "Davide De Pasquale", 2);
        Customer cliente1 = new Customer(1733686L, "Tommaso Bevilacqua",1);
        Customer cliente2 = new Customer(54185925L, "Arianna Pozzi", 1);
        Customer cliente3 = new Customer(311210L, "Marianna Occhineri", 2);
        Customer cliente4 = new Customer(923631L, "Filippo Pappappero", 2);
        Customer cliente5 = new Customer(5889204L, "Maria Manodalcielo", 1);

        List<Customer> listaClienti = Arrays.asList(cliente,cliente1,cliente2,cliente3,cliente4,cliente5);



        Order ordine1 = new Order(3564L, "In Spedizione", "10-10-2024", "15-10-2024", prodottiAcqOrd1 , cliente1);
        Order ordine2 = new Order(4567L,"Consegnato", "10-02-2021","21-02-2021",prodottiAcqOrd2, cliente3);
        Order ordine3 = new Order(3453L,"Consegnato", "25-02-2021","27-02-2021", prodottiAcqOrd3 , cliente4);
        Order ordine4 = new Order(3211L, "Consegnato", "25-03-2024", "29-03-2024", prodottiAcqOrd4 , cliente);
        List<Order> listaOrdini = Arrays.asList(ordine1,ordine2,ordine3,ordine4);



        System.out.println(prodotto11);
        System.out.println(ordine1);

         //Primo Esercizio
        Stream<Product> str = listaProdotti.stream().filter(ele-> ele.price > 100);
        str.forEach(ele -> System.out.println("I prodotti che costano più di 100€ sono : "+ ele.name + "(Costo : " + ele.price));

         //Secondo Esercizio
        Stream<Product> strBaby = listaProdotti.stream().filter(ele -> ele.category.equals("Baby"));
        strBaby.forEach(ele -> System.out.println("Gli elementi che appartengono alla categoria baby sono : " + ele.name));

        Stream<Order> strOrdBaby = listaOrdini.stream().filter(ele-> ele.products.contains("Baby"));
        strOrdBaby.forEach(ele -> System.out.println("Gli ordini che hanno prodotti di tipo Baby sono : " + ele.id));



        //Terzo Esercizio
      listaProdotti.stream().filter(ele-> ele.category.equals("Boys")).forEach(ele-> {
              double prezzoscont = ele.price * 0.9;
          System.out.println("Prodotto per ragazzi in sconto : " + ele.name);
          System.out.println("Il nuovo prezzo scontato è : " + prezzoscont);

      });


      //Quarto Esercizio







    }
}
