package ru.htp.decomposition.main;

import java.util.Random;

public class Main4 {

// 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. 

	public static void main(String[] args) {
		int[] mas = new int[3];
		int nod;
		int a;
		int b;
		int nok;

		initWhisRandomValue(mas);
		sort(mas);
		printLine();

		nod = findNod(mas);
		printRes("НОД = ", nod);
		printLine();

		a = mas[0];
		printRes("а = ", a);
		b = mas[1];
		printRes("b = ", b);
		printLine();

		nok = findNok(a, b, nod);
		printRes("НОК = ", nok);

	}

	static int findNok(int a, int b, int nod) {

		int value = a / nod * b;

		return value;
	}

	public static int findNod(int[] mas) {

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

	public static void initWhisRandomValue(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}

	}

	public static void print(int[] mas) {
		int i;
		for (i = 0; i < mas.length - 1; i++) {
			System.out.print(mas[i] + " -- ");
		}
		System.out.println(mas[i]);
	}

	public static void printLine() {
		System.out.println("------------------");
	}

	public static void printRes(String mesage, int a) {
		System.out.println(mesage + a);
	}
}
