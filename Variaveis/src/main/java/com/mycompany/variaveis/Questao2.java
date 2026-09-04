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

public class Questao2 {
    public static void main(String[] args) {
       //variavel 
      int idade;
      //criar a ENTRADA
      Scanner entradaNumero = new Scanner(System.in);
     
      //SAIDA
    System.out.println("Digite a sua idade:");
    idade = entradaNumero.nextInt();
       
     //imprimir mensagem SAIDA
        System.out.println("Voce tem "+idade+ " anos.");
        
    }
}
