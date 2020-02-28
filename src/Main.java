import java.util.Scanner;

public class Main{
	private int min;
	private int max;
	public Main(){
		inicializar();
	}

	public static void main(String []args){
		Main main = new Main();
	}

	private void inicializar(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese ");
		int size = Integer.parseInt(sc.nextLine().trim());
		int arr[] = generarNumeros(size);
		String opcion="";
		do {
			System.out.println("1). Algoritmo de burbuja");
			System.out.println("2). Algoritmo hibrido");
			System.out.println("3). Salir");
			opcion = sc.nextLine();
			if (opcion.trim().equals("1")){
				BubbleSort bb = new BubbleSort(arr.clone());
			}else if (opcion.trim().equals("2")){
				HybridSort hb = new HybridSort(arr.clone());
			}
		}while(opcion.trim().equals("3"));
	}


	private int[] generarNumeros(int size){
		long inicio=System.currentTimeMillis();
		int arr[]= new int[size];

		for (int i=0;i<size;i++){
			arr[i]=(int)(Math.random()*10001);
			if (this.max<arr[i])this.max=arr[i];
			if (this.min>arr[i])this.min=arr[i];
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo algoritmo generador de números "+(fin-inicio)+"(ms)");
		return arr;
	}

	private void printNumbers(int arr[]){
		for (int i =0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
