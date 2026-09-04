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
public class Questao10 {
    public static void main(String[] args) {
        
        //variaveis
        String nome;
        int idade;
        double salario;
        boolean assinada;
        
        //criar ENTRADA
         Scanner entradaTexto  = new Scanner(System.in);
         Scanner entradaNumero = new Scanner(System.in); 
         Scanner entradaLogica = new Scanner(System.in);
        
         //SAIDA
         System.out.println(" Digite o seu nome: ");
         nome= entradaTexto.nextLine();
         
         System.out.println("Digite a sua idade: ");
         idade = entradaNumero.nextInt();
         
         System.out.println("Digite o valor do seu salario:");
         salario = entradaNumero.nextDouble();
         
         System.out.println("Voce possui carteira assinada ");
         System.out.println("Digite 1 para sim,ou 0 para nao ");
         assinada= entradaLogica.hasNextBoolean();
         
         //imprimir mensagem
         System.out.println("Ola "+nome );
         System.out.println("Voce tem "+idade+" anos");
         System.out.println("Seu salario e RS"+salario);
         System.out.println("Carteira assinada e : "+assinada);

         
    }
}
