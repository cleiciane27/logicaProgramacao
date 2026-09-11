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
public class DesafioSwitchCase {
    public static void main(String[] args) {
        //variaveis
        
        int quantidade,numeroproduto;
        double  valorTotal;
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
        //solicitar dados
        
        System.out.println("Ola, por favor seleciona seu produto: ");
        System.out.println("1 - Hamburger ....RS 15.00\n2 - Pizza ....RS 25.00\n3 - Cachorro-quente ....RS 12.00\n4 - Refrigerante ....RS 6.00\n5 - Suco ....RS 8.00");
        numeroproduto = entradaTexto.nextInt();
        
        System.out.println("Voce selecionou "+numeroproduto+" qual seria a quantidade");
        quantidade = entradaNumero.nextInt();
        switch (numeroproduto){
                case 1:
                valorTotal = 15 * quantidade;
                System.out.println("========Pedido===========");
                System.out.println("Produto: Hamburger\nQuantidade "+quantidade+"\nPreco unitario:RS15.00\nValor total: "+valorTotal);  
                break;
                
                case 2:
                valorTotal = 25 * quantidade;
                System.out.println("========Pedido===========");
                System.out.println("Produto: Pizza\nQuantidade "+quantidade+"\nPreco unitario:RS25.00\nValor total: "+valorTotal);                    
                break;
                
                case 3:
                valorTotal = 12 * quantidade;
                System.out.println("========Pedido===========");
                System.out.println("Produto: Cachorro-quente\nQuantidade "+quantidade+"\nPreco unitario:RS12.00\nValor total: "+valorTotal);                    
                break;
                
                case 4:
                valorTotal = 6 * quantidade;
                System.out.println("========Pedido===========");
                System.out.println("Produto: Refrigerante\nQuantidade "+quantidade+"\nPreco unitario:RS6.00\nValor total: "+valorTotal);                
                break;
                
                case 5:
                valorTotal = 8 * quantidade;
                System.out.println("========Pedido===========");
                System.out.println("Produto: Suco\nQuantidade "+quantidade+"\nPreco unitario:RS8.00\nValor total: "+valorTotal);
                break;
                
                default:
                System.out.println("A opcao escolhida e invalida");
                break;                               
                
             }
        System.out.println("Volte sempre!");
        
    }
}
