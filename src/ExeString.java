
public class ExeString {

	public static void main(String[] args) {
		String a = "Fulano de Beltrano Cardoso";
		
		String formatada = a.toLowerCase();
		
		int letras[] = new int[26];
		
		//inicializando o array
		for(int i=0;i<26;i++){
			letras[i] = 0;
		}
		morlucas@gmail.com
		
		//verificando as quantidades
		for(int i = 0;i<formatada.length(); i++){
			switch(formatada.charAt(i)){
			case 'a':
				letras[0]++;
				break;
			case 'b':
				letras[1]++;
				break;
			case 'c':
				letras[2]++;
				break;
			case 'd':
				letras[3]++;
				break;
			case 'e':
				letras[4]++;
				break;
			case 'f':
				letras[5]++;
				break;
			case 'g':
				letras[6]++;
				break;
			case 'h':
				letras[7]++;
				break;
			case 'i':
				letras[8]++;
				break;
			case 'j':
				letras[9]++;
				break;
			case 'k':
				letras[10]++;
				break;
			case 'l':
				letras[11]++;
				break;
			case 'm':
				letras[12]++;
				break;
			case 'n':
				letras[13]++;
				break;
			case 'o':
				letras[14]++;
				break;
			case 'p':
				letras[15]++;
				break;
			case 'q':
				letras[16]++;
				break;
			case 'r':
				letras[17]++;
				break;
			case 's':
				letras[18]++;
				break;
			case 't':
				letras[19]++;
				break;
			case 'u':
				letras[20]++;
				break;
			case 'v':
				letras[21]++;
				break;
			case 'w':
				letras[22]++;
				break;
			case 'x':
				letras[23]++;
				break;
			case 'y':
				letras[24]++;
				break;
			case 'z':
				letras[25]++;
				break;
			}
		}
		char let = 'a';
		for(int i = 0;i<letras.length;i++){
			if(letras[i] != 0){
				System.out.print(let + " - ");
				System.out.println(letras[i]);
				
			}
			let++;
		}
		
		
		
	}

}
