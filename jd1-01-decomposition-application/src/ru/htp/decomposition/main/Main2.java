package ru.htp.decomposition.main;

import java.util.Random;

public class Main2 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел: (НОК(A,B)=A*B/НОД(A,B))
	 */

	public static void main(String[] args) {

		int a, b;
		int nod, nok;

		a = randomValue(100);
		b = randomValue(10);

		print("A = ", a);
		print("B = ", b);

		line();

		nod = nodFinder(a, b);

		print("НОД = ", nod);

		line();

		nok = nokFinder(a, b, nod);

		print("НОК = ", nok);

	}

	public static int nokFinder(int a, int b, int c) {
		int value;
		value = a * b / c;
		return value;

	}

	public static int nodFinder(int a, int b) {
		int value;
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		value = a + b;
		return value;
	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);

	}

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);
	}

	public static void line() {
		System.out.println("-----------------------------");
	}

}
