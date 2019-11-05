package ru.htp.decomposition.main;

import java.util.Random;

public class Main5 {

// 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел. 

	public static void main(String[] args) {
		int a, b, c, min, max, sum;

		a = randomValue(100);
		b = randomValue(100);
		c = randomValue(100);

		print("A = ", a);
		print("B = ", b);
		print("C = ", c);

		printLine();

		min = minNumber(a, b, c);
		print("Самое маленькое число из трех = ", min);

		printLine();

		max = maxNumber(a, b, c);
		print("Самое большое число из трех = ", max);

		printLine();

		sum = sumMinMax(min, max);
		print("Сумма наименьшего и наибольшего из трех чисел = ", sum);

	}

	public static int sumMinMax(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

	public static int maxNumber(int a, int b, int c) {
		int max = 0;
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		}
		return max;
	}

	public static int minNumber(int a, int b, int c) {
		int min = 0;
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else if (c < a && c < b) {
			return c;
		}
		return min;
	}

	public static int randomValue(int limit) {
		int value;
		Random rand = new Random();
		value = rand.nextInt(limit);
		return value;
	}

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);
	}

	public static void printLine() {
		System.out.println("----------------------------------------------------");
	}

}
