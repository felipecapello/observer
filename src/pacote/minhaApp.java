package pacote;

public class minhaApp {

	public static void main(String[] args) {
		
		//observador
		
		carroPolicia carropolicia = new carroPolicia();
		
		//observado
		
		carroRoubado carroroubado = new carroRoubado();
		
		
		//adicionar observador ao observado
		
		carroroubado.addObserver(carropolicia);
	
		
		carroroubado.frente();
		carroroubado.direita();
		carroroubado.esquerda();
		carroroubado.frente();
		carroroubado.para();
		
	}

}
