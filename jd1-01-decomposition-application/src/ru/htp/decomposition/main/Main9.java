package ru.htp.decomposition.main;

import java.util.Random;

public class Main9 {

// 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = randomInt(1000);
		printInt("Число А = ", a);

		b = randomInt(1000);
		printInt("Число B = ", b);

		c = randomInt(1000);
		printInt("Число C = ", c);

		int nodAB = nodFinder(a, b);
		printInt("НОД чисел А и В = ", nodAB);

		int nodBC = nodFinder(b, c);
		printInt("НОД чисел B и C = ", nodBC);

		int nodAC = nodFinder(a, c);
		printInt("НОД чисел A и C = ", nodAC);

		primeNum(nodAB, nodBC, nodAC);

	}

	public static void primeNum(int a, int b, int c) {
		if (a == 1 && b == 1 && c == 1) {
			System.out.println("------------------------------");
			System.out.println("Числа А, B и С взаимно простые");
		} else {
			System.out.println("---------------------------------");
			System.out.println("Числа А, B и С не взаимно простые");
		}
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

	public static int randomInt(int limit) {

		Random rand = new Random();
		int x = rand.nextInt(limit);
		return x;

	}

	public static void printInt(String mesage, int a) {

		System.out.println(mesage + a);

	}

}
