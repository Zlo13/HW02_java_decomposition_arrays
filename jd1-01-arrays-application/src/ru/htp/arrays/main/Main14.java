package ru.htp.arrays.main;

import java.util.Random;

public class Main14 {

//	14.Дан одномерный массив A[N]. Найти: max(a2,a4,...,a2k) + min(a1,a3,...,a2k+1)  

	public static void main(String[] args) {

		int[] mas = new int[10];

		randomValue(mas);
		printMas(mas);

		int max = mas[0];
		int min = mas[1];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			i++;

		}

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
			i++;
		}
		System.out.println("  " + max + " + " + min + " = " + (max + min));
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
		System.out.println("\n");
	}
}
