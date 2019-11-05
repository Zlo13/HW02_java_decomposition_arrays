package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main18 {

// 18. Найти все натуральные n-значные числа, цифры в которых образуют 
//	строго возрастающую последовательность (например, 1234, 5789). Для решения 
//	задачи использовать декомпозицию.

	public static void main(String[] args) {

		int n;
		n = entreNum("Введите число ");

		findProgresion(n);

	}

	public static void findProgresion(int n) {

		int min;
		int max;
		int bigNum;
		int num;
		int amount;

		min = (int) Math.pow(10, (n - 1));
		max = (int) (Math.pow(10, n) - 1);

		for (int i = min; i <= max; i++) {

			bigNum = 10;
			amount = 0;

			for (int j = i; j > 0; j = j / 10) {

				num = j % 10;
				amount++;

				if (bigNum > num) {
					bigNum = num;
				} else {
					break;
				}

				if (amount == n) {
					System.out.println(i);
				}
			}
		}
	}
	public static int entreNum(String mesage) {
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

}
