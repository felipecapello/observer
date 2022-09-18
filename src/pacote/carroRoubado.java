package pacote;

import java.util.Observable;

public class carroRoubado extends Observable implements carro {
	
		private String acao = "";
		
		public void frente() {
			
			acao = "frente";
			System.out.println("Carro Roubado segue em frente");
			this.mudaEstado();
			
		}
		
		public void direita() {
			
			acao = "direita";
			System.out.println("Carro Roubado vira a direita");
			this.mudaEstado();
			
		}

		public void esquerda() {
	
			acao = "esquerda";
			System.out.println("Carro Roubado vira a direita");
			this.mudaEstado();
	
		}

		public void para() {
	
			acao = "para";
			System.out.println("Carro Roubado para");
			
	
		}
		
		public void mudaEstado() {
			setChanged();
			notifyObservers(acao);
		}

}
