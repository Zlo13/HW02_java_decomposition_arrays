package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main19 {

// 19. Написать программу, определяющую сумму n - значных чисел, содержащих 
//	только нечетные цифры. Определить также, сколько четных цифр в найденной 
//	сумме. Для решения задачи использовать декомпозицию. 

	public static void main(String[] args) {

		int n;

		n = entreNum("Введите число, до которого вести поиск элементов:");

		makeMass(n);

	}

	public static void makeMass(int n) {

		int sum = 0;

		int[] mass = new int[n];

		for (int i = 10; i < mass.length; i++) {
			if (checkOdd(i)) {
				sum = sum + i;
			}
		}

		System.out.println("Сумма нечетных чисел = " + sum);
		System.out.println();

		evenNum(sum);

	}

	public static boolean checkOdd(int n) {

		boolean flag = true;
		int g1 = 0;

		while (n > 0) {
			g1 = n % 10;
			n = n / 10;
			if ((g1 % 2) == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void evenNum(int n) {
		int g1 = 0;
		int k = 0;

		while (n > 0) {
			g1 = n % 10;
			n = n / 10;

			if ((g1 % 2) == 0) {
				k++;
			}
		}
		System.out.println("Количство четных цифр в полученной сумме = " + k);
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
