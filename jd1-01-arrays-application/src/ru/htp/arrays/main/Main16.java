package ru.htp.arrays.main;

import java.util.Random;

public class Main16 {

// 16. Даны действительные числа a1,a2,...,an . Найти max(a1 + a2n,a2 + a2n−1,...,an + an+1).

	public static void main(String[] args) {

		int[] mas1 = new int[10];

		randomValue(mas1);

		int j = 0;

		int[] mas2 = new int[mas1.length - 1];

		for (int i = 0; i < (mas1.length - 1); i++) {
			mas2[j] = mas1[i] + mas1[i + 1];
			j++;
		}

		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");

		}
		System.out.println(" ");

		int max = mas1[0];
		for (int i = 0; i < mas2.length; i++) {
			if (mas2[i] > max) {
				max = mas2[i];
			}
		}
		System.out.println(max);
	}

	public static void randomValue(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

}
