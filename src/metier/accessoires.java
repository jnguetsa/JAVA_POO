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
public class accessoires implements calcul{
    //Etats des critères: 0=Absent/Non conforme 1=Passable 2=Conforme
    private double a1;
    private double a2;
    private double a3;
    private double a4;
    private double a5;

    // Constructeur
    public accessoires(double a1, double a2, double a3, double a4, double a5) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    // Pourcentage de reussite au test
    @Override
    public double calculPourcentage() {
        double somme = a1 + a2 + a3 + a4 + a5;
        return (somme * 10);
    }

    @Override
    public double calculValeur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
