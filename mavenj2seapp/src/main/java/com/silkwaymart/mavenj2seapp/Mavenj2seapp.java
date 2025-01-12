/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.silkwaymart.mavenj2seapp;

/**
 *
 * @author DELL
 */
public class Mavenj2seapp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int x = 3;
        while(x > 0){
            if(x > 2){
                System.out.print("a");
                System.out.print("-");
                x = x - 1;
            }
            if(x == 2){
                System.out.print("b c");
                System.out.print("-");
                x = x - 1;
            }
            if(x == 1){
                System.out.print("d");
            }
            x = x - 1;
        }
    }
}
