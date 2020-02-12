import java.util.Scanner;

public class Main{

	private int max;
	private int min;

	public static void main(String []args){
		Main main = new Main();
		main.max=0;
		main.min=0;
		Scanner sc = new Scanner (System.in);
		int size = Integer.parseInt(sc.nextLine().trim());
		int arr[] = main.generarNumeros(size);
//		BubbleSort bb = new BubbleSort(arr);
		HybridSort gb = new HybridSort(arr);
	}

	private int[] generarNumeros(int size){
		int arr[]= new int[size];

		for (int i=0;i<size;i++){
			arr[i]=(int)(Math.random()*10001);
			if (this.max<arr[i])this.max=arr[i];
			if (this.min>arr[i])this.min=arr[i];
		}
		return arr;
	}
	private void printNumbers(int arr[]){
		for (int i =0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
