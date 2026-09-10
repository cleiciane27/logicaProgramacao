/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author CleicianeGomes
 */
public class Exemplo3 {
    public static void main(String[] args) {
        
       //variaveis
       int idadep1, idadep2, idadep3;
       
       //scanner
    Scanner entradaNumero = new Scanner(System.in);
    
    //solicitar dados ao usuario
        System.out.println("Digite a idade da Pessoa 1 ");
        idadep1 = entradaNumero.nextInt();
        System.out.println("Digite a idade da Pessoa 2 ");
        idadep2 = entradaNumero.nextInt();
        System.out.println("Digite a idade da Pessoa 3 ");
        idadep3 = entradaNumero.nextInt();
        
        //AVALIANDO AS IDADES
        if(idadep1>idadep2 || idadep1<idadep3){
            System.out.println("Pessoa 1 ganha brinde");}
        if(idadep2>idadep3 && idadep2>idadep1){
            System.out.println("Pessoa 2 ganha brinde");}
        
        if((idadep3<idadep1 || idadep3<idadep2) && idadep2>idadep1){
            System.out.println("Pessoa 3 ganha brinde");}
        
    }
}
