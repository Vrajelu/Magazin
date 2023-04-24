package org.example;

public class Legume extends Produse {
    private String usturoi;
    private String cartofi;
    private String castraveti;
    private String rosii;
    private String ceapa;

    private double pret;

    public Legume(String usturoi, String cartofi, String castraveti, String rosii, String ceapa) {

    }

    public Legume() {

    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getCeapa() {
        return ceapa;
    }

    public void setCeapa(String ceapa) {
        this.ceapa = ceapa;
    }

    public String getRosii() {
        return rosii;
    }

    public void setRosii(String rosii) {
        this.rosii = rosii;
    }

    public String getCastraveti() {
        return castraveti;
    }

    public void setCastraveti(String castraveti) {
        this.castraveti = castraveti;
    }

    public String getCartofi() {
        return cartofi;
    }

    public void setCartofi(String cartofi) {
        this.cartofi = cartofi;
    }

    public String getUsturoi() {
        return usturoi;
    }

    public void setUsturoi(String usturoi) {
        this.usturoi = usturoi;
    }
}
