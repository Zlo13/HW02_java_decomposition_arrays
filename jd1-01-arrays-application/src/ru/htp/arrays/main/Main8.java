package ru.htp.arrays.main;

public class Main8 {

// 8. Дан массив действительных чисел, размерность которого N. Подсчитать, 
//	сколько в нем отрицательных, положительных и нулевых элементов.

	public static void main(String[] args) {

		int mas[] = new int[] { 5, 15, 0, 14, -2, 4, -3, 0, 12, -3 };

		printMas(mas);

		countPositiveNumber(mas);
		countNegativeNumber(mas);
		countZero(mas);

	}

	public static int countZero(int[] mas) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				counter++;
			}

		}
		System.out.println("  В массиве " + counter + " нулевых элемента");
		return counter;
	}

	public static int countNegativeNumber(int[] mas) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				counter++;
			}

		}
		System.out.println("  В массиве " + counter + " отрицательных элемента");
		return counter;
	}

	public static int countPositiveNumber(int[] mas) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				counter++;
			}

		}
		System.out.println("  В массиве " + counter + " положительных элемента");
		return counter;
	}

	public static void printMas(int[] mas) {
		System.out.println("  --------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
		System.out.println("  --------------------------------------");
	}

}
