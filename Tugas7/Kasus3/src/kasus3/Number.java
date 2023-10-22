package kasus3;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Integer[] intList;
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many integers do want to sort?? ");
		size = scan.nextInt();
		intList = new Integer[size];
		
		System.out.println("\nEnter the number...");
		for(int i =0 ; i<size; i++) {
			intList[i] = scan.nextInt();
		}
		
		Sorting.selectionSort(intList);
		System.out.println("\nYour number in sorted oerder...");
		for(int i =0;i<size;i++) {
			System.out.println(intList[i] + " ");
		}
		System.out.println();
	}
}