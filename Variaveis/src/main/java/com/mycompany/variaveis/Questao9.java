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
public class Questao9 {
    public static void main(String[] args) {
        
       //variavel
       boolean matriculado;
       
       //criar ENTRADA 
      Scanner entradaLogica = new Scanner(System.in);
      
      //Criar SAIDA
      System.out.println("Voce e matriculado (a)");
      System.out.println("Digite true para sim,ou false para nao");
      matriculado= entradaLogica.nextBoolean();
      
      //imprimir mensagem
    System.out.println("Seu status de matricula e "+matriculado);

        
    }
}
