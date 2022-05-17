/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botigapart1;

/**
 *
 * @author neti
 */
public class ProducteUnitat extends Producte {

    private float descompte;
    private float preuMinimPerAplicarDescompte;

    public ProducteUnitat(float descompte, float preuMinimPerAplicarDescompte, int preu, String nom) {
        super(preu, nom);
        this.descompte = descompte;
        this.preuMinimPerAplicarDescompte = preuMinimPerAplicarDescompte;
    }

    public float getDescompte() {
        return descompte;
    }

    public void setDescompte(float descompte) {
        this.descompte = descompte;
    }

    public float getPreuMinimPerAplicarDescompte() {
        return preuMinimPerAplicarDescompte;
    }

    public void setPreuMinimPerAplicarDescompte(float preuMinimPerAplicarDescompte) {
        this.preuMinimPerAplicarDescompte = preuMinimPerAplicarDescompte;
    }

    @Override
    public float CalcularPreu(float quantitat) {

       if (getPreu() * quantitat >= preuMinimPerAplicarDescompte ) {
           return getPreu() * quantitat - (getPreu() * quantitat) * descompte;
       } else {
           return getPreu() * quantitat;
       } 
    }
}


        