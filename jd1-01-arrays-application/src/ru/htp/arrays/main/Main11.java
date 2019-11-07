package ru.htp.arrays.main;

import java.util.Random;

public class Main11 {

// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых 
//	остаток от деления на М равен L (0 < L < М-1). 

	public static void main(String[] args) {

		int[] mas = new int[10];

		int m = 3;
		int l = 1;

		randomValue(mas);
		printMas(mas);
		resultCalc(mas, m, l);

	}

	public static void resultCalc(int[] mas, int m, int l) {
		if ((l > 0) && (l < m - 1)) {

			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % m == l) {

					System.out.print(mas[i] + "\n"); // "\n" - перенос на новую строку
				}
			}
		}
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
