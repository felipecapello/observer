package pacote;

import java.util.Observer;
import java.util.Observable;

public class carroPolicia implements Observer, carro {
	
	private String acao = "";
	
	public void frente() {
		
		acao = "frente";
		System.out.println("Viatura segue em frente");
		
		
	}
	
	public void direita() {
		
		acao = "direita";
		System.out.println("Viatura vira a direita");
		
		
	}

	public void esquerda() {

		acao = "esquerda";
		System.out.println("Viatura vira a direita");
		

	}

	public void para() {

		acao = "para";
		System.out.println("Viatura para");
		

	}

	public void update(Observable arg0, Object arg1) {
		carroRoubado carroObservado = (carroRoubado) arg0;
		String acao  = String.valueOf(arg1);
		
		if(acao.equals("frente")) {
			this.frente();
			
		}
		
		else if(acao.equals("direita")) {
			this.direita();
		}
		
		else if(acao.equals("esquerda")) {
			this.esquerda();
			
		}
		
		else if(acao.equals("para")) {
			this.para();
			
		}
	}
}
