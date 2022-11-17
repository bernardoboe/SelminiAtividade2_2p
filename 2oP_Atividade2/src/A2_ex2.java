
import java.util.Random;
import java.util.Scanner;

public class A2_ex2 {

	public static void main(String[] args) {
	
		int [] x = new int[10];
		
		preencher(x);
		imprimir(x);
		ordenar(x);
		System.out.println("Ordenado: ");
		imprimir(x);
		if(buscar(x) == true) {
			System.out.println("O número está contido");
		}else {
			System.out.println("O número não está contido");
		}
		
	}

	public static void preencher(int[]x) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(1,100);
			
		}
	
	}
	
	public static void imprimir(int[]x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
			
		}
		System.out.println();
			
		}
	public static void ordenar(int[]x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - i - 1; j++) {
				if(x[j] > x[j+1]) {
					int aux = x[j];
					x[j] = x[j+1];
					x[j+1] = aux;
					
				}
			}
			
		}
	}
	
	public static boolean buscar(int[] x) {
		Scanner teclado = new Scanner(System.in);
		
		int meio = (x.length/2)-1;
		int busca;
		
		System.out.print("Digite o número que será buscado: ");
		busca = teclado.nextInt();
		
		if(busca == x[meio]){
			return true;
		}else if(busca > x[meio]){
			for (int i = meio + 1; i < x.length; i++) {
				meio = meio/2;
				if(busca == x[(meio/2)]) {
					return true;
				}
			}
			
		}else if(busca < x[meio]) {
			return false;
		}
		return false;
	}
	
}
