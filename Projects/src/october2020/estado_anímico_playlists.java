package october2020;

import java.util.Scanner;

/**
* @author Ismael
* */

public class estado_anímico_playlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numero;
	
		do{
			System.out.printf("\t\t   ||DESCUBRA UNA PLAYLIST ADECUADA A SU ESTADO ANIMICO ACTUAL|| \n\n");
			System.out.printf("\n *  DESCUBRA LA PLAYLIST 1 SI ESTA NOSTALGICO  *\n");
			System.out.printf("\n *  DESCUBRA LA PLAYLIST 2 SI ESTA MOTIVADO    *\n");
			System.out.printf("\n *  DESCUBRA LA PLAYLIST 3 SI ESTA REFLEXIVO   *\n");
			System.out.printf("\n *  DESCUBRA LA PLAYLIST 4 SI ESTA ENAMORADO   *\n");
			System.out.printf("\n *  DESCUBRA LA PLAYLIST 5 SI ESTA ILUSIONADO  *\n");
			System.out.printf("\n *   DESCUBRA LA PLAYLIST 6 SI ESTA ANIMADO    *\n\n");
			System.out.printf("\n\t                   || Pulse numero 0 para SALIR de la APP. ||\n\n\n");
				
			System.out.printf("\t\t// INGRESAR NUMERO DE PLAYLIST EN ESTA LINEA // P L A Y L I S T ");
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();
		        
		        if (numero == 1) {
		        	System.out.printf ("\n\"Home\" - Knucks");
		        	System.out.printf ("\n\"Otra noche en Miami\" - Bad Bunny");
		        	System.out.printf ("\n\"No where\" - Ayrtn");
		        	System.out.printf ("\n\"We can be happy\" - Dj Poolboi");
		        	System.out.printf ("\n\"Something to feel\" - Shaolin Cowboy\n\n\n");
		        }
		        
				else if(numero == 2) {
					System.out.printf ("\n\"Heartbreak\" - Bonobo");
					System.out.printf ("\n\"Jungle\" - DJ Lag");
					System.out.printf ("\n\"Popopop\" - Gambi");
					System.out.printf ("\n\"Blossom\" - Logic1000");
					System.out.printf ("\n\"Still rapping\" - C.Tangana\n\n\n");
			    }
		        
		        else if (numero == 3) {
		        	System.out.printf ("\n\"Something in the water\" - Saba");
		        	System.out.printf ("\n\"Time flies\" - Drake");
		        	System.out.printf ("\n\"Talk to me you'll understand\" - Ross from friends");
		        	System.out.printf ("\n\"Mind\" - Greentea Peng");
		        	System.out.printf ("\n\"George Bondo\" - Westside Gunn\n\n\n");
		        }
		        
		        else if (numero == 4) {
		        	System.out.printf ("\n\"Un d�a\" - J.Balvin");
		        	System.out.printf ("\n\"Ghosteame\" - Cruz Cafune");
		        	System.out.printf ("\n\"In Spain we call it soledad\" - Rigoberta Bandini");
		        	System.out.printf ("\n\"Lost my mind\" - Dave B");
		        	System.out.printf ("\n\"Summertime\" - Astral Weeks\n\n\n");
		        }
		        
		        else if (numero == 5) {
		        	System.out.printf ("\n\"Skippin\" - Dreya Mac");
		        	System.out.printf ("\n\"White Iverson\" - Post Malone");
		        	System.out.printf ("\n\"Aufsteigen\" - Computer Data");
		        	System.out.printf ("\n\"Middle\" - DJ Snake");
		        	System.out.printf ("\n\"Hola!\" - Enyel C\n\n\n");
		        }
		        
		        else if (numero == 6) {
		        	System.out.printf ("\n\"Este a�o no hay cosecha\" - Pikette 23");
		        	System.out.printf ("\n\"Matcha\" - Trey Christie");
		        	System.out.printf ("\n\"Funny thing\" - Thundercat");
		        	System.out.printf ("\n\"Stunnin'\" - Curtis Waters");
		        	System.out.printf ("\n\"M to B\" - Millie B\n\n\n");
		        }

				else if ( numero < 0 || numero == 7 || numero > 7 ) {
					System.out.printf( "\n  \t\t * E R R O R *  Lo sentimos, aun no disponemos de tantas playlists." );
					System.out.printf( "\n  \t\t    Ingrese un valor entre 1 y 6, y le mostraremos una playlist.\n\n\n" );
				}
		        
		   }while( numero != 0 );
		
		
	}

}