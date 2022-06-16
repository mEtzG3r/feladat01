/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.feladat01;

/**
 *
 * @author Admin
 */
public class Feladat01 {
    
    public static int feladat01(String[] szinek) {
        int hossz = szinek.length;
        int keverek = 0;
        
        for(int i=0; i<hossz; i++) {
            for(int j=i+1; j<hossz; j++) {
                if(!szinek[i].equals(szinek[j])) {
                    keverek+=1;
                }
            }
        }
        
        return keverek;
    }
    
    public static void main(String[] args) {
        String[] szinek={"piros","zöld","kék"};
        
        System.out.println("A megadott színekből keverhető színek száma: " + feladat01(szinek));
    }
}
