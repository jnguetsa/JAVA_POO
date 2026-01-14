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
public class total {
    private double a;
    private double b;
    private double c;
    private double d;

    // Constructeur
    public total(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Méthode pour calculer le pourcentage de reussite global aux tests a=accessoire,b=lumiere,c=documentation,d=moteur
    public double calculerValeur() {
        return ((a + b)/6 + (c + d)/3);
    }
    
    // Nouvelle méthode : renvoie 1 si le test est passé avec succès (total >= 50) sinon 0
    public int estSuperieurA50() {
        return calculerValeur() >= 50 ? 1 : 0;
    }

}
