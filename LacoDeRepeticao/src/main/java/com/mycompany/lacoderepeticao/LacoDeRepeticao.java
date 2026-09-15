/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticao;

import java.util.Scanner;

/**
 *
 * @author CleicianeGomes
 */
public class LacoDeRepeticao {

    public static void main(String[] args) {
    //programa para preencher lista de convidados
    
   String[] listaConvidados = new String [20];
       Scanner entradaTexto = new Scanner(System.in);
       
   //solicitar para dona da festa preencher a lista
    for(int cont=0; cont<=19;cont++){
        System.out.println("Digite o nome do convidado: ");
        listaConvidados[cont]=entradaTexto.nextLine();
    }
    //imprimir a lista de cinvidados
    for(int cont=0;cont<=19;cont++){
        System.out.println("Convidados "+cont+" : "+listaConvidados[cont]);}
    
    }
}
