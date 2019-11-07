package ru.htp.arrays.main;

import java.util.Random;
import java.util.Scanner;


public class Main9 {

// 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

	public static void main(String[] args) {

		int a;

		a = enterNum("Укажите длинну массива");
		
		int [] mas = lengthMas(a);
		
		randomMasElement(mas);
		printMas(mas);
		
		sort(mas);
		printMas(mas);
		
		replacementMinMax(mas);
		printMas(mas);

	}
	public static void replacementMinMax (int [] mas) {
	   int min;
	   
	   min = mas[0];
	   mas[0] = mas[mas.length-1];
	   mas[mas.length-1] = min;
	}
	public static void sort(int[] mas) {
		int indexMinElement = 0;

		for (int i = 0; i < mas.length; i++) {
			indexMinElement = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[indexMinElement] > mas[j]) {
					indexMinElement = j;
				}
			}
			int temp = mas[indexMinElement];
			mas[indexMinElement] = mas[i];
			mas[i] = temp;
		}

	}

	public static int enterNum(String mesage) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mesage);
		}

		value = sc.nextInt();
		return value;

	}

	public static int[] lengthMas(int a) {
		int[] mas = new int[a];
		return mas;
	}

	public static void randomMasElement(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
		System.out.println("  --------------------------------------");
	}

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);
	}

}
