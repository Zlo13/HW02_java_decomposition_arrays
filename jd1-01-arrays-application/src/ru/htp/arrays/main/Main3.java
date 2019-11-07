package ru.htp.arrays.main;

import java.util.Random;

public class Main3 {

// 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число 
//	встречается раньше - положительное или отрицательное. 

	public static void main(String[] args) {

		int[] mas = new int[10];

		randNum(mas);

		printMas(mas);

		findNum(mas);

	}

	public static void findNum(int[] mas) {
		int i = 0;
		while (i < mas.length) {
			if (mas[i] < 0) {
				System.out.println("");
				System.out.println("-------------------------------------------------------------");
				System.out.println("              !Первое число отрицательное!");
				break;
			} else {
				System.out.println("");
				System.out.println("-------------------------------------------------------------");
				System.out.println("              !Первое число положительное!");
				break;
			}

		}

	}

	public static void randNum(int[] mas) {
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (rnd.nextInt(21) - 10);
		}
	}

	public static void printMas(int[] mas) {
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.printf("%6d", mas[i]);
		}
	}

}
