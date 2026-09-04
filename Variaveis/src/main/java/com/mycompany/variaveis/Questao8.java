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
public class Questao8 {
    public static void main(String[] args) {
       
        //variavel
        double temperatura;
        
        //criar ENTRADA
        Scanner entradaNumero = new Scanner(System.in);
        
        //SAIDA
        System.out.println("Digite a temperatura de hoje em graus Celsius:");
        temperatura = entradaNumero.nextDouble();
        
        //imprimir saida
        System.out.println("A temperatura informada foi: "+temperatura+" C");

        
    }
}
