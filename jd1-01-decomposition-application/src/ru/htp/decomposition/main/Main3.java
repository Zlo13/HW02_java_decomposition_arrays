package ru.htp.decomposition.main;

import java.util.Random;

public class Main3 {

//  3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. 

	public static void main(String[] args) {
		int[] mas = new int[4];
		int n;

		initWithRandomValue(mas);

		sort(mas);

		printLine();

		n = nod(mas);

		printNod("НОД = ", n);

	}

	public static int nod(int[] mas) {

		int cell = mas[0];

		for (int i = 1; i < mas.length; i++) {
			cell = getNod(cell, mas[i]);
		}
		// System.out.println(cell);
		return cell;
	}

	public static int getNod(int a, int b) {

		if (b == 0) {
			return a;
		}

		return getNod(b, a % b);

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
			print(mas);
		}

	}

	public static void initWithRandomValue(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
	}

	public static void print(int[] mas) {
		int i;
		for (i = 0; i < mas.length - 1; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println(mas[i]);
	}

	public static void printLine() {
		System.out.println("------------------");
	}

	public static void printNod(String mesage, int a) {
		System.out.println(mesage + a);
	}
}
