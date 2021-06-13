package com.local;
import java.util.Scanner;
public class EntradaDeDados {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Entre com o nome: ");
	String nome = entrada.nextLine();

        System.out.println("Oi " + nome +  " ,Tudo bem?");
    }
}
