/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botigapart1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author neti
 */
public  class Producte {
    
    private float preu;
    private String nom;

    public Producte(int preu, String nom) {
        this.preu = preu;
        this.nom = nom;
    }
    
    public int getPreu() {
        return (int) preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public float CalcularPreu( float quantitat){
        return quantitat;
    }
   
     public  static String afegirProducte() {
        ArrayList<Producte> llistaProductes = new ArrayList<Producte>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom del producte:");
        String nom = sc.nextLine();
        System.out.println("Introdueix el preu el producte");
        int preu = sc.nextInt();
         Producte p = new Producte(nom.charAt(preu), preu);
        return afegirProducte();
     }
        
       
        
            
       

        
    

    @Override
    public String toString() {
        return "Producte{" + "preu=" + preu + ", nom=" + nom + '}';
    }
        
    
}
