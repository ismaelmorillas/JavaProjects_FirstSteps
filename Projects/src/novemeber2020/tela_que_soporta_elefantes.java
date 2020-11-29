/** 

*  

*/ 

package novemeber2020;
import java.util.Scanner; 
/** 

* @author Ismael 
* 
*/
public class tela_que_soporta_elefantes {
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        int tela=0, elefante=0, suma=0, contador=1; 
        Scanner entrada = new Scanner(System.in);
        
           do {
        System.out.println("Introduce peso de tela");
		tela = entrada.nextInt();
		
		contador=1;
        
		suma = 0;	
							if (tela>=1) {
							
								do {
									System.out.println("Introduce elefante " +contador);
									elefante = entrada.nextInt();
									contador++;
							        suma += elefante;
								}while (suma<tela);
									System.out.println("Tela rota");
							}
           }while(tela!=0);
           	System.out.println("Has finalizado el proceso.");
}
}
