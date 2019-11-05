package ru.htp.decomposition.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main15 {

// 15. Даны натуральные числа К и N. Написать метод(методы) формирования 
//	массива А, элементами которого являются числа, сумма цифр которых 
//	равна К и которые не большее N. 

	public static void main(String[] args) {

		int k;
		int n;

		k = entreNum("Введите натуральное число К:");
		n = entreNum("Введите натуральное число N:");

		ArrayList<Integer> a = new ArrayList<>();

		form(a, k, n);

		for (Integer s : a) {

			System.out.print(s + " ");

		}
	}

	public static void form(ArrayList<Integer> a, int k, int n) {

		for (int i = 0; i <= n; ++i) {

			if (sumNamMas(i) == k)
				a.add(i);
		}
	}

	public static int sumNamMas(int a) {

		int sum = 0;

		do {
			sum += a % 10;
			a = a / 10;
		} while (a % 10 != 0);

		return sum;
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
