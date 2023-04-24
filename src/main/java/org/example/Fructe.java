package org.example;

public class Fructe extends Produse {
    private String mere;
    private String banane;
    private String portocale;
    private String kiwi;
    private String struguri;

    private double pret;


    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getStruguri() {
        return struguri;
    }

    public void setStruguri(String struguri) {
        this.struguri = struguri;
    }

    public String getKiwi() {
        return kiwi;
    }

    public void setKiwi(String kiwi) {
        this.kiwi = kiwi;
    }

    public String getPortocale() {
        return portocale;
    }

    public void setPortocale(String portocale) {
        this.portocale = portocale;
    }

    public String getBanane() {
        return banane;
    }

    public void setBanane(String banane) {
        this.banane = banane;
    }

    public String getMere() {
        return mere;
    }

    public void setMere(String mere) {
        this.mere = mere;
    }

    public Fructe() {
        this.mere = mere;

    }}
