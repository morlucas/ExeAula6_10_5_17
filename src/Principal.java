
public class Principal {
	public static void main(String[] args) {
		int opcaoAleatoria;
		String pedaco1 = null;
		String pedaco2 = null;
		String pedaco3 = null;
		
		String SUJEITO_1 = "Maria";
		String SUJEITO_2 = "João";
		String SUJEITO_3 = "Fulano";
		
		String VERBO_1 = "implicou com o(a)";
		String VERBO_2 = "foi ao";
		String VERBO_3 = "não gosta de";
		
		String PREDICADO_1 = "arroz.";
		String PREDICADO_2 = "banheiro.";
		String PREDICADO_3 = "chifre em cabeça de cavalo.";
		
		
		opcaoAleatoria = (int) Math.round( (Math.random() * 2) );
		
		//seleciona o pedaco de frase SUJEITO
		switch(opcaoAleatoria){
		case 0:
			pedaco1 = SUJEITO_1;
			break;
		case 1:
			pedaco1 = SUJEITO_2;
			break;
		case 2:
			pedaco1 = SUJEITO_3;
			break;
		}
		
		opcaoAleatoria = (int) Math.round( (Math.random() * 2) );

		//seleciona o pedaco de frase VERBO
		if(opcaoAleatoria == 0){
			pedaco2 = VERBO_1;
		}else if(opcaoAleatoria == 1){
			pedaco2 = VERBO_2;
		}else{
			pedaco2 = VERBO_3;
		}
		
		opcaoAleatoria = (int) Math.round( (Math.random() * 2) );
			
		//seleciona o pedaco de frase PREDICADO
		if(opcaoAleatoria == 0){
			pedaco3 = PREDICADO_1;
		}else if(opcaoAleatoria == 1){
			pedaco3 = PREDICADO_2;
		}else{
			pedaco3 = PREDICADO_3;
		}
		
		System.out.println(pedaco1 + " " + pedaco2 + " " + pedaco3);
	}
}
