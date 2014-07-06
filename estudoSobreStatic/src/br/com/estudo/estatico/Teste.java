package br.com.estudo.estatico;

public class Teste {
	public static void main(String[] args) {
		
		ClasseA objeto1 = new ClasseA();
		objeto1.conta();
		objeto1.contaEstatico();
		
		ClasseA objeto2 = new ClasseA();
		objeto2.conta();
		objeto2.contaEstatico();
		
		objeto2.conta();
	}
}
