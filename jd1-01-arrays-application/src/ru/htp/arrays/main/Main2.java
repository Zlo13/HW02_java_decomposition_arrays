package ru.htp.arrays.main;

public class Main2 {

//  2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

	public static void main(String[] args) {

		int[] mas = { 22, 15, 0, 14, 0, 22, 0, 74, 0, 12, 0 };

		int countZeroElement = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZeroElement++;
			}
		}
		
		printMas(mas);
		
		System.out.println();
		System.out.printf("%2d", countZeroElement);
		System.out.println();

		int[] masZeroElEndex = new int[countZeroElement];
		
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				masZeroElEndex[j]=i;
				j++;
			}

		}
		printMas(masZeroElEndex);

	}
	
	
	public static void printMas(int[] mas) {
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i]);
		}
	}
}
