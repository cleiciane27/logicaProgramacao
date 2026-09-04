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
public class CalculosBasicos {
    public static void main(String[] args) {
       
        //TRABALHAR COM CALCULOS
        int num1,num2, resultadoResto;
        double resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro");
        num1 = entradaNumero.nextInt();
        
        System.out.println("Digite um valor inteiro");
        num2 = entradaNumero.nextInt();
        
        //SOMA
        resultadoSoma = num1 + num2;
        System.out.println("A soma dos numeros e: "+resultadoSoma);
        
        //SUBTRACAO
        resultadoSubtracao = num1 - num2;
        System.out.println("A subtracao dos numeros e: "+resultadoSubtracao);
        
        //MULTIPLICACAO
        resultadoMultiplicacao = num1 * num2;
        System.out.println("A multiplicacao dos numeros e: "+resultadoMultiplicacao);
        
        //DIVISAO
        resultadoDivisao = num1 / num2;
        System.out.println("A divisao dos numeros e: "+resultadoDivisao);
        
        //CALCULO DE RESTO
          resultadoResto = num1 % num2;
          System.out.println("O resto da divisao dos numeros e: "+resultadoResto);
        
    }
}
