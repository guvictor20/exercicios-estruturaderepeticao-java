package com.exercicios.estruturaderepeticao;

import java.util.Scanner;

/* 2. Faça um programa que leia um nome de usuário e a sua senha
e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro
e voltando a pedir as informações. */

public class Exercicio01ValidaUserESenha {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        System.out.println("Digite um nome de usuário: ");
        nome = scan.next();

        while (true){
            System.out.println("Digite a senha de usuário: ");
            senha = scan.next();

            if (senha.equals(nome)){
                System.out.println("A senha não pode ser igual ao seu nome, escolha uma senha diferente.");
            }else {
                System.out.println("Usuário e senha cadastrados com sucesso.");
                break;
            }
        }
	}

}
