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
public class Questao7 {
    public static void main(String[] args) {
        
        //variaveis
        String nome;
        int idade;
        float altura;
        
        // criar ENTRADA
        Scanner entradaTexto  = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
        // Saida
        System.out.println("Digite seu nome:");
        nome= entradaTexto.nextLine();
        
        System.out.println("Digite sua idade:");
        idade = entradaNumero.nextInt();
        
        System.out.println("Digite sua altura:");
        altura = entradaNumero.nextFloat();
        
        //imprimir mensagem
        System.out.println("Bem-vindo (a) "+nome);
        System.out.println("Voce tem "+idade+" anos");
        System.out.println("Voce possui "+altura+" metros de altura");
        
    }
}
