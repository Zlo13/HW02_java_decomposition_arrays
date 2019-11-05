package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main17 {

//  17. Натуральное число, в записи которого n цифр, называется 
//	числом Армстронга, если сумма его цифр, возведенная в степень n, 
//	равна самому числу. Найти все числа Армстронга от 1 до k. Для 
//	решения задачи использовать декомпозицию. 

	public static void main(String[] args) {

		int k;

		k = entreNum("Введите число К:");

		numArmstrong(k);

	}

	public static void numArmstrong(int k) {

		for (int i = 10; i < k; i++) {

			int b = 0;
			int m = i;
			int j = 0;

			while (m > 0) {
				int a = m % 10;
				m = m / 10;

				if (i < 100) {
					b = (a * a);

				} else if ((i >= 100) && (i < 1000)) {
					b = (a * a * a);

				} else if ((i >= 100) && (i < 1000)) {
					b = (a * a * a * a);
				}
				j = j + b;
			}
			if (i == j) {
				System.out.println("Число Армстронга =  " + i);
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
