package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main13 {

//   13. Дано натуральное число N. Написать метод(методы) для формирования 
//	 массива, элементами которого являются цифры числа N. 

	public static void main(String[] args) {

		int n;

		n = entreNum("Введите натуральное число:");

		int[] mas = new int[masLenght(n)];

		form(mas, n);

		printMas(mas);

	}

	public static void form(int[] arr, int N) {

		do {
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = N % 10;
				N = N / 10;
			}

		} while (N % 10 != 0);

	}

	public static int masLenght(int n) {

		int count = 0;

		do {
			n = n / 10;
			count++;

		} while (n % 10 != 0);

		return count;

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

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
	}

}
