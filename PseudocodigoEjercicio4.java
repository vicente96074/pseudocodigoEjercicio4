import java.util.Scanner;

public class PseudocodigoEjercicio4{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int[] edadPersona = new int[20];
		int personaMayor = 0;
		int personaMenor = 0;
		
		for(int i = 0; i<8; i++){
			System.out.print("Ingrese su edad: ");
			edadPersona[i] = entrada.nextInt();
		}
		
		for(int i = 0; i<8; i++){
		
			if(i==0){
				personaMenor = edadPersona[i];
			}
			if(edadPersona[i]>personaMayor){
				personaMayor = edadPersona[i];
			}
			
			if(personaMenor>edadPersona[i]){
				personaMenor = edadPersona[i];
			}
		}
		
		System.out.println("La persona mayor es: "+personaMayor);
		System.out.println("La persona menor es: "+personaMenor);
		
	}
	
	
}
