package org.example;

public class Produse {
       // vom avea nume, pret si discount
     private String nume;
     private double pret;
     private int discount;

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getDiscount() {
        return discount;
    }

    public String setDiscount(int discount) {
        this.discount = discount;
        if (discount > 0 && discount<100) {
        } else {
            System.out.println("Acest discount nu este valid");
        }
        return null;
    }

        public void Produse() {
           double pretFinal = pret - pret*discount/5;
           System.out.println("Pretul final este: "+pretFinal);
        }
    }

