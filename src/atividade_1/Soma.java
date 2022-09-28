package atividade_1;

public class Soma {
	// Atributo
	private int numero;
	
	// Construtor
	public Soma(int numero) {
		super();
		this.numero = numero;
	}
	
	public Soma() {

	}
	
	// Metodos get e set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// Metodos
	public int somaValores(int num) {
        if (num == 0)
            return 0;
        else
            return num + somaValores(num - 1);
	}
	
	

}
