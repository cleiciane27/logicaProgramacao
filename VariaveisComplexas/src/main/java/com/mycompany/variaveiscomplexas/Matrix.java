/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveiscomplexas;

import java.util.Scanner;

/**
 *
 * @author CleicianeGomes
 */
public class Matrix {
    public static void main(String[] args) {

//LINHAS PRIMEIRO DEPOIS COLUNAS

        String [][] alunos= new String[11][2];
        
        alunos[0][0]="Jordana";
        alunos[1][0]="Geovana";
        alunos[2][0]="Kauwan";
        alunos[3][0]="Kaleb";
        alunos[4][0]="Arthur M.";       
        alunos[5][0]="Antonio" ;  
        alunos[7][0]="Enzo";
        alunos[9][0]="Pedro";        
                
        alunos[0][1]="Rogerio";
        alunos[1][1]="Israel";
        alunos[2][1]="Arthur B.";      
        alunos[3][1]="Cleiciane";
        alunos[4][1]="Samara";
        alunos[5][1]="Marya";   
        alunos[6][1]="Victor";  
        alunos[9][1]="Daniel" ;     
        alunos[10][1]="Raniely";      
    
        int coluna,linha;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Escolha um numero da linha");
        linha = entradaNumero.nextInt();
        System.out.println("Escolha um numero da coluna");
        coluna = entradaNumero.nextInt();
        
        System.out.println(alunos[linha][coluna]);
        
        
        
        
        
        
        
    }
}
