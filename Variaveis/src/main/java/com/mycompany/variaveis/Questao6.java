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
public class Questao6 {
    public static void main(String[] args) {
        
        //variavel
        int soma1;
        int soma2;
        int resultado;
        //entrada
        Scanner entradaNumero = new Scanner(System.in); 
        
        //SAIDA
         System.out.print("Digite o primeira numero: ");
        soma1 = entradaNumero.nextInt();

        System.out.print("Digite o segunda numero: ");
        soma2 = entradaNumero.nextInt();
        
        resultado= (soma1 + soma2);
        //imprimir mensagem
        System.out.println("Resultado da soma: "+resultado);

        
    }
}
