package Programa;

import entidades.ArCondicionado;

public class Principal {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();

		System.out.println("Aumentando temperatura em 30:");
		ar.aumentaTemperatura(30);
		
		System.out.println("\nAumentando temperatura em 30 (2):");
		try{
			ar.aumentaTemperatura_2(30);
		}catch(IllegalArgumentException e){
			System.out.println("Erro: temperatura inv�lida.\nA temperatura foi mantida em "+ar.getTemperaturaAtual());
		}
		
		System.out.println("Fim do programa =)");
		
	}

}