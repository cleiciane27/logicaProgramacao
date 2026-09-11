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
public class AprendendoSwitchCase {
    public static void main(String[] args) {
        
        //sistema de agendamento de serviços Pet Shop
        String nomepet,racapet;
        int idadepet,opcaoservico;
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
            //solicitar dados
        System.out.println("Ola, para iniciarmos digite o nome do pet ");
        nomepet = entradaTexto.nextLine();
        System.out.println("Bem vindo "+nomepet+" qual a sua raca");
        racapet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos sua raca, nos diga a sua idade");
        idadepet = entradaNumero.nextInt();
        System.out.println("Escolha um de nossos sevicos: ");
        System.out.println("1-Tosa\n2-Banho\n3-Banho e Tosa\n4-Veterinario");
        opcaoservico = entradaNumero.nextInt();
        
        //analisando serviço com switch case
        
        switch (opcaoservico){
            case 1:
                System.out.println(nomepet+" voce possui "+idadepet+" anos de idade,e da raca "+racapet+" e escolheu o servico Tosa.");
                break;
            case 2:
                System.out.println(" voce possui "+idadepet+" anos de idade,e da raca "+racapet+" e escolheu o servico Banho.");
                break;
           case 3:
                System.out.println(nomepet+" voce possui "+idadepet+" anos de idade,e da raca "+racapet+" e escolheu o servico Banho e Tosa.");
                break;     
           case 4:
                System.out.println(nomepet+" voce possui "+idadepet+" anos de idade,e da raca "+racapet+" e escolheu o servico Veterinario.");
                break;   
           default:
                System.out.println("A opcao escolhida e invalida");
                break;
                
        }//fim do switch

        
        
    }
}
