/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botigapart1;

/**
 *
 * @author neti
 */
public class ProductePes extends Producte {

    public ProductePes(int preu, String nom) {
        super(preu, nom);
    }

    @Override
    public float CalcularPreu(float quantitat) {
        
         return getPreu()* quantitat;
    }

}
