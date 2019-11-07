package ru.htp.arrays.main;

import java.util.Random;

public class Main1 {

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 

	public static void main(String[] args) {

		int k = 2;
		double result;
		
		int[] mas = new int[7];
		
		randomValue(mas);

		result = finderSum(mas, k);

		printLine();
		print("Сумма элементов массива кратных 2 = ", result);

	}

	public static double finderSum(int[] mas, int a) {

		double tmp;
		double volume = 0;

		for (int i = 0; i < mas.length; i++) {

			tmp = mas[i];
			tmp = tmp / a;
			System.out.println(mas[i] + " ----- " + tmp);
			if (tmp % 1 == 0) {
				volume = volume + tmp;

			}
		}

		return volume;

	}

	public static void randomValue(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
	}

	public static void print(String mesage, double a) {
		System.out.println(mesage + a);
	}

	public static void printLine() {
		System.out.println("-----------------------------------------");
	}

}
