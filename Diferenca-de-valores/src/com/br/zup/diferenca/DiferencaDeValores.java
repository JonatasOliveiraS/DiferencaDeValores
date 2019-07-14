package com.br.zup.diferenca;

import java.util.Scanner;

public class DiferencaDeValores {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("informe o primeiro valor : ");
			int valorA = entrada.nextInt();
			
			System.out.println("informe o segundo valor : ");
			int valorB = entrada.nextInt();
			
			if (valorA > valorB);
			System.out.println(" a diferença entre os números é de :" + (valorA - valorB));
	}

	}
