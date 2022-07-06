package br.com.kenneth.lambdastream;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		String str = "ACBA";
		
		String resultado = str.chars()
			.map(i -> i - 64)
			//.mapToObj(i -> String.valueOf(i))// converte os elementos em uma string
			.mapToObj(String::valueOf)
			.collect(Collectors.joining("-", "=>> ", " <=="));
		
		System.out.println(resultado);
	}
}
