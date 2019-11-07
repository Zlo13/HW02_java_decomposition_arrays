package ru.htp.arrays.main;

import java.util.Random;
import java.util.Scanner;

public class Main15 {

//  15. Дана последовательность действительных чисел a1,a2,...,an. Указать те ее элементы, 
//	которые принадлежат отрезку [с, d]

	public static void main(String[] args) {
		int c;
		int d;
		int m;

		m = enterNum("Укажите длинну массива: ");

		int[] mas = new int[m];

		randomValue(mas);
		printMas(mas);

		c = enterNum("Введите начало отрезка: ");
		d = enterNum("Введите конец отрезка: ");

		resultCalc(mas, c, d);

	}

	public static void resultCalc(int[] mas, int a, int b) {
		for (int i = 0; i < mas.length; ++i) {
			if ((mas[i] >= a) && (mas[i] <= b)) {
				System.out.printf("%4d", mas[i]);
			}
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
