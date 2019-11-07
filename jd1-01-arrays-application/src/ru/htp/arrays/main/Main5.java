package ru.htp.arrays.main;

public class Main5 {

// 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать 
//	массив из четных чисел этой последовательности. Если таких чисел нет, 
//	то вывести сообщение об этом факте. 

	public static void main(String[] args) {

		int[] mas = new int[] { 1, 5, 1, 3, 3, 3, 7, 5 };

		printMas(mas);
		System.out.println();

		int evenNumberCounter = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				evenNumberCounter++;
			}
		}
		if (evenNumberCounter == 0) {
			System.out.println("В последовательности нет четных чисел");
		}

		int[] masEvenNumber = new int[evenNumberCounter];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				masEvenNumber[j] = mas[i];
				j++;

			}
		}
		System.out.println();
		printMas(masEvenNumber);

	}

	public static void printMas(int[] mas) {
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i]);
		}
	}

}
