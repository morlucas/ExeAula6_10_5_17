
public class PrincipalWithArrays {

	public static void main(String[] args) {
		
		String[] sujeito = new String[3];
		String verbo[] = new String[3];
		String predicado[] = {	" arroz.",
								" feijão.",
								" macarrão."};
		sujeito[0] = "Maria";
		sujeito[1] = "João";
		sujeito[2] = "Beltrano";
		
		verbo[0] = " não gosta de";
		verbo[1] = " é fã de";
		verbo[2] = " come todos os dias";
		
		
		int opc1, opc2, opc3;
		opc1 = (int) Math.round( (Math.random() * 2) );
		opc2 = (int) Math.round( (Math.random() * 2) );
		opc3 = (int) Math.round( (Math.random() * 2) );
		
		System.out.println(sujeito[opc1] +  verbo[opc2] + predicado[opc3]);
		
		}
	}


