package ru.htp.arrays.main;

import java.util.Random;

public class Main17 {

//  17. Дана последовательность целых чисел a1,a2,..,an . Образовать новую последовательность, 
//	выбросив из исходной те члены, которые равны min(a1,a2,...,an).

	public static void main(String[] args) {

		int[] mas1 = new int[10];
		randomValue(mas1);
		
		printMas(mas1);

		int min;
		min = minMas(mas1);

		
		int k = 0;

		int i = (mas1.length - 1);

		while (i >= 0) {
			if (mas1[i] == min) {
				k++;
			}
			i--;
		}

		int[] mas2 = new int[mas1.length - k];
		
		int j = 0;

		for (i = 0; i < (mas1.length - k); i++) {
			if (mas1[j] != min) {
				mas2[i] = mas1[j];
			} else {
				mas2[i] = mas1[j + 1];
				j++;
			}
			j++;
		}

		printMas(mas2);

	}
	public static int minMas (int []mas) {
		int min = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
		
	}
	public static void randomValue(int[] mas) {
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
	}

}
