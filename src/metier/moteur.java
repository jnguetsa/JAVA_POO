/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Niniwa
 */
public class moteur {
    private double a1;
    private double a2;
    private double a3;
    private double a4;
    private double a5;
    private double a6;
    private double a7;
    private double a8;
    private double a9;
    private double a10;

    // Constructeur
    public moteur(double a1, double a2, double a3, double a4, double a5,
                       double a6, double a7, double a8, double a9, double a10) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a10 = a10;
    }

    // Méthode pour calculer (somme des valeurs)*100/400
    public double calculerValeur() {
        double somme = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
        return (somme * 100) / 400;
    }
}
