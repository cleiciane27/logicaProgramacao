/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author CleicianeGomes
 */
public class Desafio {
    public static void main(String[] args) {
        //variaveis
        String nome, ingresso;
        int idade;
        boolean autorizacao = false;
        
    Scanner entradaTexto  = new Scanner(System.in);
    Scanner entradaNumero = new Scanner(System.in); 
    Scanner entradaLogica = new Scanner(System.in);
    
    //
        System.out.println("Digite seu nome: ");
        nome= entradaTexto.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = entradaNumero.nextInt();
        
        if (idade == 16 || idade == 17) {
        System.out.println("Você possui autorização? (true/false)");
        autorizacao = entradaLogica.nextBoolean();
        } 
         
        System.out.println("Informe seu tipo de ingresso: ");
        ingresso = entradaTexto.nextLine();
        
       
        if (idade>=18 && ingresso.equals("VIP")){
            System.out.println("Acesso VIP liberado! ");}
        else if (idade>=18 && ingresso.equals("COMUM")){
            System.out.println("Acesso comum liberado! ");}
        else if ((idade>=16 && idade<=17) && autorizacao == true ){
            System.out.println("Acesso liberado com autorizacao! ");}
        else if (ingresso.equals("PROFESSOR") || ingresso.equals("FUNCIONARIO")){
            System.out.println("Acesso especial liberado!");}
        else {System.out.println("Acesso negado!");}
        
        System.out.println("Bem vindo(a) "+nome);
        
        System.out.println("Voce tem "+idade+" anos.");
 
        
        
        
        
        
    }
}
