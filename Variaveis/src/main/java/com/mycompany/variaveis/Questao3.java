/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author CleicianeGomes
 */

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        //variavel
        double nota1;
        double nota2;
        double media;
       //criar ENTRADA
        Scanner entradaNumero = new Scanner(System.in); 
        
       //solicitar as notas SAIDA
        System.out.print("Digite a primeira nota: ");
        nota1 = entradaNumero.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entradaNumero.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média é: " + media);
        
        
    }
 
}
