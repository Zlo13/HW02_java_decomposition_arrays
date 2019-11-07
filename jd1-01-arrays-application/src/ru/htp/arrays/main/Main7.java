package ru.htp.arrays.main;

import java.util.Random;
import java.util.Scanner;

public class Main7 {

// 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
//	Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 

	public static void main(String[] args) {
		int a;
		int z;
		int counter;
		a = enterNum("Укажите длинну массива");
		int[] mas = lengthMas(a);

		randomMasElement(mas);
		printMas(mas);
		z = enterNum("Укажите число Z ");

		counter = replaceCounter(mas, z);
		print("Число измененных элементов = ", counter);
		
		printMas(mas);

	}

	public static int replaceCounter(int[] mas, int z) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas [i] > z) {
				mas [i] = z;
				counter++;
			}
		}
		return counter;

	}

	public static int enterNum(String mesage) { // ввод числа с консоли
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) { // Защита от "дурака"
			sc.next();
			System.out.println(mesage);
		}

		value = sc.nextInt();
		return value;

	}

	public static int[] lengthMas(int a) {
		int[] mas = new int[a];
		return mas;
	}

	public static void randomMasElement(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
	}

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);
	}

}
