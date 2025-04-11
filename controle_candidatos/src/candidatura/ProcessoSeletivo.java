package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		selecionarCandidatos();
	}
	
	static void selecionarCandidatos() {
		String [] candidatos = {"MARCOS","MILENA","MELISSA","MARCELO","JASMINE","BEATRIZ","FELIPE","JOSE","MARIA","JOAO","GABRIEL","GISELE","JANAINA","HENRIQUE"};
		String [] listaSelecionados  = new String[5];
		int indiceCandidato = 0;
		int candidatosSelecionados = 0;
		
		while(candidatosSelecionados < 5 && indiceCandidato < candidatos.length) {
			String candidato = candidatos[indiceCandidato];
			double salarioPretendido = gerarSalario();
			System.out.print("Candidato: " + candidato + "; Salário Pretendido = R$");
			System.out.printf("%.2f\n", salarioPretendido);
			if(analisarCandidatos(salarioPretendido, candidato)) {
				listaSelecionados[candidatosSelecionados] = candidato;
				candidatosSelecionados++;
			}
			indiceCandidato++;
		}
		
		imprimirCandidatos(listaSelecionados);
		ligarParaCandidatos(listaSelecionados);
	}
	
	static boolean analisarCandidatos(double salarioPretendido, String candidato) {
		double salarioBase = 2000.00;
		if(salarioPretendido < salarioBase) {
			System.out.println("Ligar para " + candidato);
			return true;
		} else if(salarioPretendido == salarioBase) {
			System.out.println("Ligar para " + candidato + " com contra proposta");
			return true;
		} else {
			System.out.println("Aguardando resultados dos demais candidatos");
			return false;
		}
	}
	
	static void imprimirCandidatos(String[] listaCandidatos) {
		System.out.println();
		System.out.println("Candidatos Selecionados");
		for(int i=0; i<listaCandidatos.length; i++) {
			System.out.println((i+1) + " - " + listaCandidatos[i]);
		}
		System.out.println();
	}
	
	static void ligarParaCandidatos(String[] listaCandidatos) {
		for(String c: listaCandidatos) {
			boolean atendeu = false;
			int numeroTentativas = 0;
			do {
				atendeu = atenderTelefone();
				numeroTentativas++;
			} while(!atendeu && numeroTentativas < 3);
			
			if(atendeu) {
				System.out.println(c + " atendeu na " + numeroTentativas + "ª tentativa\n");
			} else {
				System.out.println(c + " não atendeu nenhuma das ligações feitas\n");
			}
		}
		
	}
	
	static boolean atenderTelefone() {
		Random random = new Random();
		int op = random.nextInt(3) + 1;
		if(op==1) return true;
		return false; 
	}
	
	static double gerarSalario() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}

}
