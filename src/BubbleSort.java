import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class BubbleSort{

	private int arr[];

	public BubbleSort(int []arr){
		this.arr=arr;
		long inicio = System.currentTimeMillis();
		ordenar();
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución Ordenamiento Burbuja "+(fin-inicio)+"(ms)");
		imprimir();
		}
	public void ordenar(){
		for (int i = 0;i<this.arr.length-1;i++){
			for (int j = 0;j <this.arr.length-i-1;j++){
				if (arr[j]<arr[j+1]){
					int temp = this.arr[j];
					this.arr[j]= this.arr[j+1];
					this.arr[j+1]=temp;
				}
			}
		}
	}
	public void imprimir(){
		for (int i =0;i<this.arr.length;i++){
			System.out.println(this.arr[i]);
		}
	}


}
