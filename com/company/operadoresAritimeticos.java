package com.company;

import java.util.Scanner;


public class operadoresAritimeticos {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite sua idade em anos:");
        int idade = dados.nextInt();
        System.out.println("Digite os meses: ");
        int meses = dados.nextInt();
        System.out.println("Digite os dias: ");
        int dias = dados.nextInt();

        int idadeEmDias = idade * 365 + meses * 30 + dias;
        System.out.println("Sua idade em dias são:");
        System.out.println(idadeEmDias + " dias.");
    }
}
