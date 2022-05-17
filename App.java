/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botigapart1;
import java.util.Scanner;

import java.io.ObjectStreamConstants;
import java.util.ArrayList;

/**
 *
 * @author neti
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        boolean sortir = false;
        String producte;
        do {            
            
            System.out.println("====================");
            System.out.println("1- Crear producte");
            System.out.println("2- Mostrar productes");
            System.out.println("3- Buscar producte");
            System.out.println("4- Sortir del programa");
            int dadaSwitch = sc.nextInt();
            switch(dadaSwitch){
                case 1: Botiga.afegirProducte(); 
                case 2: 
                case 3:
                case 4: System.out.println("Sortint del programa...");
            }

            
        } while (sortir == true);
    }
}
