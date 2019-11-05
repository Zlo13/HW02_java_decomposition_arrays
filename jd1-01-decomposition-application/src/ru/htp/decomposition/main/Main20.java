package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main20 {

// 20. Из заданного числа вычли сумму его цифр. Из результата вновь 
//	вычли сумму его цифр и т.д. Сколько таких действий надо произвести, 
//	чтобы получился нуль? Для решения задачи использовать декомпозицию.

	public static void main(String[] args) {

		int n;
		int a;

		n = entreNum("Введите число: ");

		a = counter(n);

		print("Для получения 0 было произведено действий ", a);

	}

	public static int counter(int n) {

		int count = 0;

		while (n != 0) {
			n = n - sum(n);
			count++;
		}
		return count;

	}

	public static int sum(int n) {

		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
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

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);

	}

}
