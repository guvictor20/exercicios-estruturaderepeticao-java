package com.exercicios.estruturaderepeticao;

import java.util.Scanner;

/* 1. Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido. */

public class Exercicio01NotaZeroADez {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota entre zero e dez:");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){

            System.out.println("A nota digitada é inválida, digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Você digitou a nota: "+nota+"\n"+"Nota cadastrada com sucesso.");
		
		
	}

}
