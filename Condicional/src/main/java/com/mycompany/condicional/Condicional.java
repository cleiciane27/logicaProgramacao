/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author CleicianeGomes
 */
public class Condicional {

    public static void main(String[] args) {
/* Condicional é o codigo utilizado para avaliar dados, e se for verdadeiro  
  realiza uma açao, e se for falso outra açao.
  SE - IF
  SENAO - ELSE
   
  TABELA LOGICA:
  > MAIOR QUE     
  < MENOR QUE
  >= MAIOR OU IGUAL      
  <= MENOR OU IGUAL
  == IGUAL     
  =! DIFERENTE      
 */      
//variavel
int idade;

//variavel de entrada de dados
Scanner entradaNumero = new Scanner(System.in);

      //solicitaçao para usuario
        System.out.println("Digite a sua idade:");
        idade = entradaNumero.nextInt();
        
//analise da  idade (processamento)
  if(idade >=18){
      System.out.println("voce e maior de idade");  
    }else{
      System.out.println("voce e menor de idade");
  }
    }
    
    
}
    
