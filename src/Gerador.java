
public class Gerador {
		String sujeito[] = {	"Maria ",
								"João ",
								"Ciclano "};
		
		String verbo[] = {	"não gosta de ",
							"é fã de ",
							"nunca comeu "};
		
		String predicado[] = {	"arroz.",
								"feijão.",
								"bobó camarão."};
	Gerador(){
		
	}
	
	void criaFrase(){
		int opc1, opc2, opc3;
		opc1 = (int) Math.round( (Math.random() * 2) );
		opc2 = (int) Math.round( (Math.random() * 2) );
		opc3 = (int) Math.round( (Math.random() * 2) );
		
		System.out.println(sujeito[opc1] +  verbo[opc2] + predicado[opc3]);
	}
	
	void criaFrase(int numFrases){
		int i = 0;
		for( ;;){
			if(i==numFrases) break;
			int opc1, opc2, opc3;
			opc1 = (int) Math.round( (Math.random() * 2) );
			opc2 = (int) Math.round( (Math.random() * 2) );
			opc3 = (int) Math.round( (Math.random() * 2) );
			
			System.out.println(sujeito[opc1] +  verbo[opc2] + predicado[opc3]);
			i++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
