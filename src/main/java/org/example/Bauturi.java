package org.example;

public class Bauturi extends Produse {
    private String apa;
    private String sucuri;
    private String bere;
    private String vin;
    private String lichior;

    private double pret;

    public Bauturi(String apa, String sucuri, String bere, String vin, String lichior) {

    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getLichior() {
        return lichior;
    }

    public void setLichior(String lichior) {
        this.lichior = lichior;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBere() {
        return bere;
    }

    public void setBere(String bere) {
        this.bere = bere;
    }

    public String getSucuri() {
        return sucuri;
    }

    public void setSucuri(String sucuri) {
        this.sucuri = sucuri;
    }

    public String getApa() {
        return apa;
    }

    public void setApa(String apa) {
        this.apa = apa;
    }
}
