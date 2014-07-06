package br.com.estudo.estatico;

public class ClasseA {
	private static int contadorEstatico;
	private int contador;
	
	public static void contaEstatico(){
		contadorEstatico++;
		System.out.println(contadorEstatico);
	}

	public void conta(){
		contador++;
		System.out.println(contador);
	}

	public static int getContadorEstatico() {
		return contadorEstatico;
	}

	public int getContador() {
		return contador;
	}
	
	
}
