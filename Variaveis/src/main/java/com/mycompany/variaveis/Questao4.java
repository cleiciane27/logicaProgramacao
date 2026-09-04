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
public class Questao4 {
    public static void main(String[] args) {
        //variavel
        double altura;
        //criar ENTRADA
        Scanner entradaNumero = new Scanner(System.in); 
        //SAIDA
        System.out.println("Imforme sua altura:");
        altura = entradaNumero.nextDouble();
        
        //imprmir mensagem
        System.out.println("Sua altura e "+altura+" metros");

    }
 
}
