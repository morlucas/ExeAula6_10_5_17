
public class PrincipalWithArrays {

	public static void main(String[] args) {
		
		String[] sujeito = new String[3];
		String verbo[] = new String[3];
		String predicado[] = {	" arroz.",
								" feij�o.",
								" macarr�o."};
		sujeito[0] = "Maria";
		sujeito[1] = "Jo�o";
		sujeito[2] = "Beltrano";
		
		verbo[0] = " n�o gosta de";
		verbo[1] = " � f� de";
		verbo[2] = " come todos os dias";
		
		
		int opc1, opc2, opc3;
		opc1 = (int) Math.round( (Math.random() * 2) );
		opc2 = (int) Math.round( (Math.random() * 2) );
		opc3 = (int) Math.round( (Math.random() * 2) );
		
		System.out.println(sujeito[opc1] +  verbo[opc2] + predicado[opc3]);
		
		}
	}


