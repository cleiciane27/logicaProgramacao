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
public class Questao5 {
    public static void main(String[] args) {
        
        //variavel
        int idade;
        boolean emaior;
        //criar ENTRADA
        Scanner entradaLogica = new Scanner(System.in);
        
        //SAIDA
        System.out.println("Digite sua idade");
        idade = entradaLogica.nextInt();
        emaior = idade >= 18;
        
        //imprimir mensagem
        System.out.println("Maior de idade: "+emaior);


                
    }
}
