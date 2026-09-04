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
public class Questao11 {
    public static void main(String[] args) {
        
      
      double num1,num2, num3,resultadoSoma,resultadoMultiplicacao, resultadoDivisao;
      
      Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Digite um valor decimal");
        num1 = entradaNumero.nextDouble();
        
        System.out.println("Digite um valor decimal");
        num2 = entradaNumero.nextDouble();
        
        System.out.println("Digite um valor decimal");
        num3 = entradaNumero.nextDouble();
      
        //soma
        resultadoSoma = num1 + num2 + num3;
        System.out.println("A soma dos numeros e: "+resultadoSoma);
        
        //multi.
        resultadoMultiplicacao = num1 * num3;
        System.out.println("A multiplicacao dos numeros e: "+resultadoMultiplicacao);
        
        //div.
        resultadoDivisao = num1 / num3;
        System.out.println("A divisao dos numeros e: "+resultadoDivisao);
        
    }
    
    
}
